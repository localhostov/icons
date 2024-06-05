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

public val Icons.Filled.AlbumCirclePlus: ImageVector
    get() {
        if (_albumCirclePlus != null) {
            return _albumCirclePlus!!
        }
        _albumCirclePlus = Builder(name = "AlbumCirclePlus", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(12.02f, 6.0f)
                curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(12.02f, 13.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(14.02f, 20.0f)
                curveToRelative(0.0f, -0.09f, 0.01f, -0.18f, 0.02f, -0.27f)
                curveToRelative(-1.62f, 0.42f, -3.41f, 0.41f, -5.32f, -0.51f)
                curveToRelative(-2.65f, -1.27f, -4.53f, -3.87f, -4.68f, -6.8f)
                curveToRelative(-0.25f, -4.73f, 3.65f, -8.64f, 8.38f, -8.41f)
                curveToRelative(2.93f, 0.14f, 5.54f, 2.02f, 6.82f, 4.66f)
                curveToRelative(0.93f, 1.91f, 0.94f, 3.7f, 0.53f, 5.32f)
                horizontalLineToRelative(0.01f)
                curveToRelative(1.64f, -0.05f, 3.13f, 0.54f, 4.25f, 1.55f)
                lineTo(24.03f, 5.0f)
                curveTo(24.02f, 2.24f, 21.78f, 0.0f, 19.02f, 0.0f)
                lineTo(5.02f, 0.0f)
                curveTo(2.26f, 0.0f, 0.02f, 2.24f, 0.02f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                lineTo(15.55f, 24.0f)
                curveToRelative(-0.95f, -1.06f, -1.54f, -2.46f, -1.54f, -4.0f)
                close()
            }
        }
        .build()
        return _albumCirclePlus!!
    }

private var _albumCirclePlus: ImageVector? = null
