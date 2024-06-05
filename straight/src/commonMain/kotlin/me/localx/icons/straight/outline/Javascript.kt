package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Javascript: ImageVector
    get() {
        if (_javascript != null) {
            return _javascript!!
        }
        _javascript = Builder(name = "Javascript", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(18.414f)
                lineToRelative(5.586f, -5.586f)
                lineTo(24.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(18.0f, 21.586f)
                verticalLineToRelative(-3.586f)
                horizontalLineToRelative(3.586f)
                lineToRelative(-3.586f, 3.586f)
                close()
                moveTo(22.0f, 16.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(6.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(6.25f, 5.0f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(4.084f)
                curveToRelative(0.0f, 1.094f, -0.891f, 1.985f, -2.0f, 1.985f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.104f, -0.008f, -2.0f, -0.895f, -2.0f, -1.985f)
                verticalLineToRelative(-0.084f)
                horizontalLineToRelative(1.255f)
                reflectiveCurveToRelative(-0.005f, 0.054f, -0.005f, 0.084f)
                curveToRelative(0.0f, 0.394f, 0.342f, 0.728f, 0.75f, 0.735f)
                curveToRelative(0.391f, 0.0f, 0.749f, -0.302f, 0.749f, -0.751f)
                verticalLineToRelative(-4.068f)
                close()
                moveTo(18.75f, 5.033f)
                lineToRelative(1.252f, 6.0f)
                horizontalLineToRelative(-1.252f)
                lineToRelative(-0.684f, -3.282f)
                lineToRelative(-0.826f, 3.282f)
                horizontalLineToRelative(-1.252f)
                lineToRelative(1.511f, -6.0f)
                horizontalLineToRelative(1.25f)
                close()
                moveTo(10.762f, 5.0f)
                lineToRelative(1.252f, 6.0f)
                horizontalLineToRelative(-1.252f)
                lineToRelative(-0.684f, -3.282f)
                lineToRelative(-0.826f, 3.282f)
                horizontalLineToRelative(-1.252f)
                lineToRelative(1.511f, -6.0f)
                horizontalLineToRelative(1.25f)
                close()
                moveTo(16.014f, 5.0f)
                lineToRelative(-1.252f, 6.0f)
                horizontalLineToRelative(-1.25f)
                lineToRelative(-1.511f, -6.0f)
                horizontalLineToRelative(1.252f)
                lineToRelative(0.826f, 3.282f)
                lineToRelative(0.684f, -3.282f)
                horizontalLineToRelative(1.252f)
                close()
            }
        }
        .build()
        return _javascript!!
    }

private var _javascript: ImageVector? = null
