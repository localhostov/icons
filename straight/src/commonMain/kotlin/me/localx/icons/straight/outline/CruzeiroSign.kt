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

public val Icons.Outline.CruzeiroSign: ImageVector
    get() {
        if (_cruzeiroSign != null) {
            return _cruzeiroSign!!
        }
        _cruzeiroSign = Builder(name = "CruzeiroSign", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.13f, 17.67f)
                lineToRelative(1.78f, 0.92f)
                curveToRelative(-1.73f, 3.34f, -5.13f, 5.41f, -8.89f, 5.41f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-5.51f, 0.0f, -10.0f, -4.49f, -10.0f, -10.0f)
                verticalLineToRelative(-4.0f)
                curveTo(2.02f, 4.49f, 6.51f, 0.0f, 12.02f, 0.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(3.82f, 0.0f, 7.26f, 2.13f, 8.96f, 5.55f)
                lineToRelative(-1.79f, 0.89f)
                curveToRelative(-1.36f, -2.74f, -4.11f, -4.45f, -7.17f, -4.45f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-4.41f, 0.0f, -8.0f, 3.59f, -8.0f, 8.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 3.71f, 2.55f, 6.83f, 5.98f, 7.73f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.54f)
                curveToRelative(1.06f, -0.95f, 2.46f, -1.54f, 4.0f, -1.54f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                verticalLineToRelative(5.0f)
                reflectiveCurveToRelative(0.01f, 0.0f, 0.02f, 0.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(3.01f, 0.0f, 5.73f, -1.66f, 7.11f, -4.33f)
                close()
            }
        }
        .build()
        return _cruzeiroSign!!
    }

private var _cruzeiroSign: ImageVector? = null
