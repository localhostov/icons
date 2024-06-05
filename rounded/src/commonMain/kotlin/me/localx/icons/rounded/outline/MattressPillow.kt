package me.localx.icons.rounded.outline

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

public val Icons.Outline.MattressPillow: ImageVector
    get() {
        if (_mattressPillow != null) {
            return _mattressPillow!!
        }
        _mattressPillow = Builder(name = "MattressPillow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                curveTo(2.243f, 3.0f, 0.0f, 5.243f, 0.0f, 8.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(5.0f, 9.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.552f, -0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(2.172f, 17.0f)
                horizontalLineToRelative(2.828f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-2.828f)
                curveToRelative(0.413f, -1.164f, 1.524f, -2.0f, 2.828f, -2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.304f, 0.0f, -2.415f, -0.836f, -2.828f, -2.0f)
                close()
                moveTo(22.0f, 16.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(12.0f, 5.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _mattressPillow!!
    }

private var _mattressPillow: ImageVector? = null
