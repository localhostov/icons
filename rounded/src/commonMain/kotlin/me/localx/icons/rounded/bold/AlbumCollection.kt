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

public val Icons.Bold.AlbumCollection: ImageVector
    get() {
        if (_albumCollection != null) {
            return _albumCollection!!
        }
        _albumCollection = Builder(name = "AlbumCollection", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 24.0f)
                lineTo(5.5f, 24.0f)
                curveToRelative(-3.03f, 0.0f, -5.5f, -2.47f, -5.5f, -5.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.03f, 0.0f, 5.5f, 2.47f, 5.5f, 5.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(5.5f, 13.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 13.0f)
                close()
                moveTo(23.62f, 8.49f)
                curveToRelative(0.55f, -0.62f, 0.49f, -1.57f, -0.13f, -2.12f)
                curveToRelative(-1.0f, -0.89f, -2.3f, -1.38f, -3.64f, -1.38f)
                lineTo(4.15f, 4.99f)
                curveToRelative(-1.34f, 0.0f, -2.63f, 0.49f, -3.64f, 1.38f)
                curveToRelative(-0.62f, 0.55f, -0.68f, 1.5f, -0.13f, 2.12f)
                curveToRelative(0.55f, 0.62f, 1.5f, 0.68f, 2.12f, 0.13f)
                curveToRelative(0.46f, -0.4f, 1.04f, -0.62f, 1.65f, -0.62f)
                horizontalLineToRelative(15.71f)
                curveToRelative(0.61f, 0.0f, 1.2f, 0.22f, 1.65f, 0.62f)
                curveToRelative(0.29f, 0.25f, 0.64f, 0.38f, 0.99f, 0.38f)
                curveToRelative(0.42f, 0.0f, 0.83f, -0.17f, 1.12f, -0.51f)
                close()
                moveTo(23.62f, 3.49f)
                curveToRelative(0.55f, -0.62f, 0.49f, -1.57f, -0.13f, -2.12f)
                curveToRelative(-1.0f, -0.89f, -2.3f, -1.38f, -3.64f, -1.38f)
                lineTo(4.15f, -0.01f)
                curveTo(2.8f, 0.0f, 1.51f, 0.49f, 0.51f, 1.38f)
                curveTo(-0.11f, 1.92f, -0.17f, 2.87f, 0.38f, 3.49f)
                curveToRelative(0.55f, 0.62f, 1.5f, 0.68f, 2.12f, 0.13f)
                curveToRelative(0.46f, -0.4f, 1.04f, -0.62f, 1.65f, -0.62f)
                horizontalLineToRelative(15.71f)
                curveToRelative(0.61f, 0.0f, 1.2f, 0.22f, 1.65f, 0.62f)
                curveToRelative(0.29f, 0.25f, 0.64f, 0.38f, 0.99f, 0.38f)
                curveToRelative(0.42f, 0.0f, 0.83f, -0.17f, 1.12f, -0.51f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-3.87f, 0.0f, -7.0f, 1.34f, -7.0f, 3.0f)
                reflectiveCurveToRelative(3.13f, 3.0f, 7.0f, 3.0f)
                reflectiveCurveToRelative(7.0f, -1.34f, 7.0f, -3.0f)
                reflectiveCurveToRelative(-3.13f, -3.0f, -7.0f, -3.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-1.38f, 0.0f, -2.5f, -0.45f, -2.5f, -1.0f)
                reflectiveCurveToRelative(1.12f, -1.0f, 2.5f, -1.0f)
                reflectiveCurveToRelative(2.5f, 0.45f, 2.5f, 1.0f)
                reflectiveCurveToRelative(-1.12f, 1.0f, -2.5f, 1.0f)
                close()
            }
        }
        .build()
        return _albumCollection!!
    }

private var _albumCollection: ImageVector? = null
