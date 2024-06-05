package me.localx.icons.straight.filled

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

public val Icons.Filled.AlbumCircleUser: ImageVector
    get() {
        if (_albumCircleUser != null) {
            return _albumCircleUser!!
        }
        _albumCircleUser = Builder(name = "AlbumCircleUser", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f)
                curveToRelative(0.95f, 0.0f, 1.84f, -0.23f, 2.63f, -0.62f)
                curveToRelative(-0.39f, -0.71f, -0.63f, -1.52f, -0.63f, -2.38f)
                curveToRelative(0.0f, -2.31f, 1.58f, -4.24f, 3.72f, -4.81f)
                curveToRelative(-0.77f, -2.42f, -3.04f, -4.19f, -5.72f, -4.19f)
                close()
                moveTo(12.0f, 13.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(12.0f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.35f, 1.35f, 0.0f, 3.0f, 0.0f)
                lineTo(21.0f, 0.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                lineTo(24.0f, 15.0f)
                curveToRelative(0.0f, -2.5f, -1.85f, -4.56f, -4.24f, -4.92f)
                curveToRelative(-0.86f, -3.48f, -4.01f, -6.08f, -7.76f, -6.08f)
                curveToRelative(-4.41f, 0.0f, -8.0f, 3.59f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.59f, 8.0f, 8.0f, 8.0f)
                curveToRelative(0.15f, 0.0f, 0.29f, -0.01f, 0.44f, -0.02f)
                curveToRelative(-0.28f, 0.62f, -0.44f, 1.3f, -0.44f, 2.02f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 24.0f)
                lineTo(14.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 18.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _albumCircleUser!!
    }

private var _albumCircleUser: ImageVector? = null
