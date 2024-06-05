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

public val Icons.Outline.Reel: ImageVector
    get() {
        if (_reel != null) {
            return _reel!!
        }
        _reel = Builder(name = "Reel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 15.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -0.553f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                lineTo(20.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                lineTo(1.0f, 0.0f)
                curveTo(0.447f, 0.0f, 0.0f, 0.447f, 0.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(4.0f, 22.0f)
                lineTo(1.0f, 22.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                lineTo(23.0f, 24.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(18.0f, 17.0f)
                lineTo(6.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(6.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 13.0f)
                close()
                moveTo(18.0f, 2.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 5.0f)
                lineTo(6.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(6.0f, 22.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 22.0f)
                close()
            }
        }
        .build()
        return _reel!!
    }

private var _reel: ImageVector? = null
