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

public val Icons.Bold.HeadSide: ImageVector
    get() {
        if (_headSide != null) {
            return _headSide!!
        }
        _headSide = Builder(name = "HeadSide", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 21.0f)
                horizontalLineToRelative(0.87f)
                curveToRelative(1.76f, 0.0f, 3.25f, -1.32f, 3.47f, -3.06f)
                lineToRelative(0.37f, -2.94f)
                horizontalLineToRelative(2.28f)
                verticalLineToRelative(-2.32f)
                reflectiveCurveToRelative(-0.57f, -1.3f, -0.79f, -1.81f)
                curveToRelative(-1.12f, -2.58f, -2.18f, -5.02f, -3.33f, -6.44f)
                curveTo(17.4f, 1.12f, 13.3f, -0.52f, 9.18f, 0.15f)
                curveTo(4.95f, 0.85f, 1.5f, 3.97f, 0.39f, 8.1f)
                curveToRelative(-0.94f, 3.49f, -0.11f, 7.12f, 2.26f, 9.96f)
                curveToRelative(0.23f, 0.27f, 0.35f, 0.61f, 0.35f, 0.95f)
                verticalLineToRelative(4.98f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(6.0f, 19.02f)
                curveToRelative(0.0f, -1.05f, -0.37f, -2.07f, -1.05f, -2.88f)
                curveToRelative(-1.74f, -2.08f, -2.35f, -4.73f, -1.67f, -7.26f)
                curveToRelative(0.79f, -2.95f, 3.36f, -5.27f, 6.38f, -5.77f)
                curveToRelative(3.0f, -0.49f, 6.0f, 0.7f, 7.85f, 3.17f)
                curveToRelative(0.91f, 1.13f, 1.93f, 3.46f, 2.91f, 5.72f)
                horizontalLineToRelative(-1.35f)
                lineToRelative(-0.7f, 5.56f)
                curveToRelative(-0.03f, 0.25f, -0.25f, 0.44f, -0.5f, 0.44f)
                horizontalLineToRelative(-3.87f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(-1.98f)
                close()
            }
        }
        .build()
        return _headSide!!
    }

private var _headSide: ImageVector? = null
