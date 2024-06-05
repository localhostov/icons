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

public val Icons.Outline.BloodDropper: ImageVector
    get() {
        if (_bloodDropper != null) {
            return _bloodDropper!!
        }
        _bloodDropper = Builder(name = "BloodDropper", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                horizontalLineToRelative(-1.551f)
                curveToRelative(-0.245f, -1.692f, -1.691f, -3.0f, -3.449f, -3.0f)
                reflectiveCurveToRelative(-3.204f, 1.308f, -3.449f, 3.0f)
                horizontalLineToRelative(-1.551f)
                curveTo(3.691f, 3.0f, 1.0f, 5.691f, 1.0f, 9.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 3.309f, 2.691f, 6.0f, 6.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(17.0f, 20.0f)
                lineTo(7.0f, 20.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineToRelative(-6.0f)
                lineTo(14.0f, 10.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                lineTo(3.142f, 8.0f)
                curveToRelative(0.447f, -1.72f, 2.0f, -3.0f, 3.858f, -3.0f)
                horizontalLineToRelative(1.851f)
                curveToRelative(0.564f, 1.178f, 1.758f, 2.0f, 3.149f, 2.0f)
                reflectiveCurveToRelative(2.585f, -0.822f, 3.149f, -2.0f)
                horizontalLineToRelative(1.851f)
                curveToRelative(1.859f, 0.0f, 3.411f, 1.28f, 3.858f, 3.0f)
                horizontalLineToRelative(-2.858f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.444f)
                curveToRelative(-0.694f, 1.19f, -1.97f, 2.0f, -3.444f, 2.0f)
                close()
            }
        }
        .build()
        return _bloodDropper!!
    }

private var _bloodDropper: ImageVector? = null
