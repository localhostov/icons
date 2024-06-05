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
                moveTo(20.5f, 15.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(18.0f, 13.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(20.5f, 17.0f)
                curveToRelative(-0.74f, 0.0f, -1.43f, -0.23f, -2.0f, -0.63f)
                curveToRelative(-0.57f, 0.4f, -1.26f, 0.63f, -2.0f, 0.63f)
                curveToRelative(-1.87f, 0.0f, -3.4f, -1.47f, -3.5f, -3.31f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                verticalLineToRelative(-3.46f)
                lineTo(14.96f, 1.84f)
                curveToRelative(0.1f, -0.43f, 0.0f, -0.88f, -0.26f, -1.24f)
                curveTo(14.44f, 0.25f, 14.04f, 0.03f, 13.58f, 0.0f)
                curveToRelative(-0.71f, -0.05f, -1.39f, 0.5f, -1.57f, 1.27f)
                lineToRelative(-2.01f, 8.7f)
                lineTo(7.99f, 1.27f)
                curveTo(7.81f, 0.5f, 7.13f, -0.04f, 6.42f, 0.0f)
                curveToRelative(-0.46f, 0.03f, -0.85f, 0.24f, -1.12f, 0.6f)
                curveToRelative(-0.26f, 0.35f, -0.36f, 0.8f, -0.26f, 1.23f)
                lineToRelative(1.77f, 7.72f)
                curveToRelative(0.68f, 0.06f, 1.33f, 0.29f, 1.9f, 0.71f)
                curveToRelative(0.96f, 0.69f, 1.56f, 1.76f, 1.66f, 2.93f)
                curveToRelative(0.08f, 1.03f, -0.23f, 2.04f, -0.87f, 2.83f)
                verticalLineToRelative(0.03f)
                curveToRelative(-0.07f, 0.07f, -2.28f, 2.28f, -2.62f, 2.63f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(2.33f, -2.33f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(0.86f, -0.86f, 0.77f, -2.3f, -0.26f, -3.05f)
                curveToRelative(-0.81f, -0.58f, -1.94f, -0.41f, -2.65f, 0.29f)
                lineToRelative(-2.69f, 2.69f)
                curveToRelative(-1.6f, 1.6f, -1.6f, 4.19f, 0.0f, 5.79f)
                lineToRelative(1.59f, 1.59f)
                curveToRelative(1.13f, 1.13f, 2.65f, 1.76f, 4.24f, 1.76f)
                horizontalLineToRelative(8.97f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                verticalLineToRelative(-2.34f)
                curveToRelative(-0.45f, 0.22f, -0.96f, 0.34f, -1.5f, 0.34f)
                close()
            }
        }
        .build()
        return _handPeace!!
    }

private var _handPeace: ImageVector? = null
