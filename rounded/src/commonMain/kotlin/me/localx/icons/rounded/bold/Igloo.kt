package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Igloo: ImageVector
    get() {
        if (_igloo != null) {
            return _igloo!!
        }
        _igloo = Builder(name = "Igloo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 3.033f, 2.468f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-6.5f)
                curveTo(24.0f, 5.383f, 18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(17.0f, 10.0f)
                horizontalLineToRelative(3.776f)
                curveToRelative(0.147f, 0.643f, 0.224f, 1.313f, 0.224f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(19.48f, 7.0f)
                horizontalLineToRelative(-5.98f)
                lineTo(13.5f, 3.126f)
                curveToRelative(2.486f, 0.419f, 4.628f, 1.86f, 5.98f, 3.874f)
                close()
                moveTo(10.5f, 3.126f)
                verticalLineToRelative(3.874f)
                lineTo(4.52f, 7.0f)
                curveToRelative(1.351f, -2.015f, 3.494f, -3.456f, 5.98f, -3.874f)
                close()
                moveTo(7.0f, 14.0f)
                lineTo(3.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.687f, 0.078f, -1.357f, 0.224f, -2.0f)
                horizontalLineToRelative(3.776f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(7.0f, 21.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-1.5f)
                lineTo(7.0f, 17.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-0.711f, 0.0f, -1.387f, 0.149f, -2.0f, 0.418f)
                verticalLineToRelative(-3.418f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.418f)
                curveToRelative(-0.613f, -0.269f, -1.289f, -0.418f, -2.0f, -0.418f)
                close()
                moveTo(18.5f, 21.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.378f, -1.121f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _igloo!!
    }

private var _igloo: ImageVector? = null
