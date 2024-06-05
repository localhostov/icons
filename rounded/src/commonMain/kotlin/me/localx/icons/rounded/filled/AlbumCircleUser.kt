package me.localx.icons.rounded.filled

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
                moveTo(19.0f, 17.5f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(23.0f, 24.0f)
                lineTo(15.0f, 24.0f)
                curveToRelative(-0.31f, 0.0f, -0.6f, -0.14f, -0.79f, -0.39f)
                curveToRelative(-0.19f, -0.24f, -0.26f, -0.56f, -0.18f, -0.86f)
                curveToRelative(0.56f, -2.17f, 2.65f, -3.75f, 4.97f, -3.75f)
                reflectiveCurveToRelative(4.41f, 1.58f, 4.97f, 3.75f)
                curveToRelative(0.08f, 0.3f, 0.01f, 0.62f, -0.18f, 0.86f)
                curveToRelative(-0.19f, 0.24f, -0.48f, 0.39f, -0.79f, 0.39f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f)
                curveToRelative(1.03f, 0.0f, 2.01f, -0.26f, 2.86f, -0.72f)
                curveToRelative(-0.54f, -0.8f, -0.86f, -1.75f, -0.86f, -2.78f)
                curveToRelative(0.0f, -2.25f, 1.51f, -4.14f, 3.56f, -4.76f)
                curveToRelative(-0.89f, -2.19f, -3.04f, -3.74f, -5.56f, -3.74f)
                close()
                moveTo(12.0f, 13.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(12.09f, 22.25f)
                curveToRelative(0.22f, -0.87f, 0.63f, -1.66f, 1.15f, -2.36f)
                curveToRelative(-0.41f, 0.06f, -0.82f, 0.11f, -1.25f, 0.11f)
                curveToRelative(-4.49f, 0.0f, -8.13f, -3.72f, -8.0f, -8.24f)
                curveToRelative(0.12f, -4.0f, 3.32f, -7.39f, 7.3f, -7.73f)
                curveToRelative(3.86f, -0.33f, 7.2f, 2.1f, 8.3f, 5.53f)
                curveToRelative(2.47f, 0.3f, 4.4f, 2.39f, 4.4f, 4.94f)
                lineTo(23.99f, 5.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.24f, 0.0f, 0.0f, 2.24f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(7.19f)
                curveToRelative(-0.2f, -0.56f, -0.25f, -1.17f, -0.1f, -1.75f)
                close()
            }
        }
        .build()
        return _albumCircleUser!!
    }

private var _albumCircleUser: ImageVector? = null
