package me.localx.icons.straight.bold

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

public val Icons.Bold.HeadSideCough: ImageVector
    get() {
        if (_headSideCough != null) {
            return _headSideCough!!
        }
        _headSideCough = Builder(name = "HeadSideCough", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 15.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(17.0f, 12.68f)
                reflectiveCurveToRelative(-0.57f, -1.3f, -0.79f, -1.81f)
                curveToRelative(-1.12f, -2.58f, -2.18f, -5.02f, -3.32f, -6.43f)
                curveTo(10.4f, 1.12f, 6.3f, -0.52f, 2.18f, 0.15f)
                curveTo(1.42f, 0.28f, 0.7f, 0.51f, 0.0f, 0.78f)
                verticalLineToRelative(3.33f)
                curveToRelative(0.82f, -0.48f, 1.72f, -0.84f, 2.67f, -0.99f)
                curveToRelative(3.01f, -0.49f, 6.0f, 0.7f, 7.85f, 3.17f)
                curveToRelative(0.91f, 1.13f, 1.93f, 3.46f, 2.91f, 5.72f)
                horizontalLineToRelative(-1.35f)
                lineToRelative(-0.7f, 5.56f)
                curveToRelative(-0.03f, 0.25f, -0.24f, 0.44f, -0.5f, 0.44f)
                horizontalLineToRelative(-3.87f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 21.01f)
                verticalLineToRelative(3.0f)
                lineTo(10.0f, 24.01f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(0.87f)
                curveToRelative(1.76f, 0.0f, 3.25f, -1.32f, 3.47f, -3.06f)
                lineToRelative(0.37f, -2.94f)
                horizontalLineToRelative(2.28f)
                verticalLineToRelative(-2.32f)
                close()
                moveTo(22.5f, 20.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(18.5f, 17.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _headSideCough!!
    }

private var _headSideCough: ImageVector? = null
