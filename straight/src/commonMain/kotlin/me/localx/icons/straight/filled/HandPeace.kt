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

public val Icons.Filled.HandPeace: ImageVector
    get() {
        if (_handPeace != null) {
            return _handPeace!!
        }
        _handPeace = Builder(name = "HandPeace", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(18.5f, 16.37f)
                curveToRelative(-0.61f, 0.43f, -1.36f, 0.66f, -2.16f, 0.63f)
                curveToRelative(-1.9f, -0.09f, -3.34f, -1.77f, -3.34f, -3.67f)
                verticalLineToRelative(-3.32f)
                horizontalLineToRelative(0.0f)
                lineTo(14.96f, 1.85f)
                curveToRelative(0.19f, -0.81f, -0.31f, -1.61f, -1.11f, -1.81f)
                curveToRelative(-0.81f, -0.19f, -1.61f, 0.31f, -1.81f, 1.11f)
                lineToRelative(-2.04f, 8.35f)
                lineTo(7.96f, 1.15f)
                curveToRelative(-0.19f, -0.81f, -1.0f, -1.3f, -1.81f, -1.11f)
                curveToRelative(-0.81f, 0.19f, -1.3f, 1.0f, -1.11f, 1.81f)
                lineToRelative(1.52f, 6.71f)
                curveToRelative(0.65f, 0.08f, 1.52f, 0.37f, 2.27f, 1.12f)
                curveToRelative(1.26f, 1.26f, 1.53f, 3.22f, 0.67f, 4.78f)
                lineToRelative(-2.85f, 3.06f)
                lineToRelative(-1.45f, -1.38f)
                lineToRelative(2.21f, -2.21f)
                curveToRelative(0.09f, -0.09f, 0.2f, -0.24f, 0.33f, -0.44f)
                curveToRelative(0.47f, -0.84f, 0.28f, -1.95f, -0.56f, -2.58f)
                curveToRelative(-0.81f, -0.6f, -1.96f, -0.44f, -2.68f, 0.28f)
                lineToRelative(-2.72f, 2.71f)
                curveToRelative(-1.03f, 1.03f, -1.03f, 2.7f, 0.0f, 3.73f)
                lineToRelative(6.39f, 6.39f)
                horizontalLineToRelative(13.82f)
                verticalLineToRelative(-7.34f)
                curveToRelative(-0.45f, 0.22f, -0.96f, 0.34f, -1.5f, 0.34f)
                curveToRelative(-0.74f, 0.0f, -1.43f, -0.23f, -2.0f, -0.63f)
                close()
                moveTo(20.5f, 8.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _handPeace!!
    }

private var _handPeace: ImageVector? = null
