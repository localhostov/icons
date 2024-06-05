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

public val Icons.Filled.CruzeiroSign: ImageVector
    get() {
        if (_cruzeiroSign != null) {
            return _cruzeiroSign!!
        }
        _cruzeiroSign = Builder(name = "CruzeiroSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.91f, 18.59f)
                curveToRelative(-1.73f, 3.34f, -5.13f, 5.41f, -8.89f, 5.41f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.28f, 0.0f, -1.47f, -0.12f, -1.47f, -0.12f)
                curveToRelative(-4.82f, -0.72f, -8.53f, -4.87f, -8.53f, -9.88f)
                verticalLineToRelative(-4.0f)
                curveTo(2.02f, 4.49f, 6.51f, 0.0f, 12.02f, 0.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(3.82f, 0.0f, 7.26f, 2.13f, 8.96f, 5.55f)
                curveToRelative(0.25f, 0.5f, 0.04f, 1.09f, -0.45f, 1.34f)
                curveToRelative(-0.49f, 0.25f, -1.1f, 0.04f, -1.34f, -0.45f)
                curveToRelative(-1.36f, -2.74f, -4.11f, -4.45f, -7.17f, -4.45f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-4.41f, 0.0f, -8.0f, 3.59f, -8.0f, 8.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 3.71f, 2.55f, 6.83f, 5.98f, 7.73f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(0.54f)
                curveToRelative(1.06f, -0.95f, 2.46f, -1.54f, 4.0f, -1.54f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                verticalLineToRelative(5.0f)
                reflectiveCurveToRelative(0.01f, 0.0f, 0.02f, 0.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(3.01f, 0.0f, 5.73f, -1.66f, 7.11f, -4.33f)
                curveToRelative(0.25f, -0.49f, 0.86f, -0.68f, 1.35f, -0.43f)
                curveToRelative(0.49f, 0.25f, 0.68f, 0.86f, 0.43f, 1.35f)
                close()
            }
        }
        .build()
        return _cruzeiroSign!!
    }

private var _cruzeiroSign: ImageVector? = null
