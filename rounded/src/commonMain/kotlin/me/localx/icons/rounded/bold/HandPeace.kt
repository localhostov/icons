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

public val Icons.Bold.HandPeace: ImageVector
    get() {
        if (_handPeace != null) {
            return _handPeace!!
        }
        _handPeace = Builder(name = "HandPeace", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 8.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(20.5f, 8.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19.0f, 16.66f)
                verticalLineToRelative(0.84f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-5.23f)
                curveToRelative(-1.4f, 0.0f, -2.74f, -0.53f, -3.76f, -1.49f)
                lineToRelative(-1.92f, -1.8f)
                lineToRelative(2.77f, -2.9f)
                curveToRelative(0.8f, -0.8f, 0.8f, -2.09f, 0.0f, -2.89f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.8f, -0.8f, -2.09f, -0.8f, -2.89f, 0.0f)
                lineToRelative(-2.46f, 2.57f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.65f, 0.66f, -1.0f, 1.53f, -1.0f, 2.46f)
                reflectiveCurveToRelative(0.36f, 1.81f, 1.06f, 2.51f)
                lineToRelative(2.39f, 2.25f)
                curveToRelative(1.58f, 1.48f, 3.65f, 2.3f, 5.82f, 2.3f)
                horizontalLineToRelative(5.23f)
                curveToRelative(3.58f, 0.0f, 6.5f, -2.92f, 6.5f, -6.5f)
                verticalLineToRelative(-0.84f)
                curveToRelative(-0.45f, 0.22f, -0.96f, 0.34f, -1.5f, 0.34f)
                reflectiveCurveToRelative(-1.05f, -0.12f, -1.5f, -0.34f)
                close()
                moveTo(7.57f, 9.83f)
                curveToRelative(0.45f, 0.2f, 0.88f, 0.48f, 1.25f, 0.85f)
                curveToRelative(0.65f, 0.65f, 1.03f, 1.47f, 1.15f, 2.32f)
                horizontalLineToRelative(0.97f)
                curveToRelative(0.91f, 0.0f, 1.7f, -0.61f, 1.93f, -1.48f)
                lineTo(15.45f, 1.88f)
                curveToRelative(0.21f, -0.8f, -0.27f, -1.62f, -1.08f, -1.83f)
                curveToRelative(-0.81f, -0.21f, -1.62f, 0.27f, -1.83f, 1.08f)
                lineToRelative(-2.07f, 7.88f)
                lineTo(8.45f, 1.12f)
                curveToRelative(-0.21f, -0.8f, -1.03f, -1.29f, -1.83f, -1.08f)
                curveToRelative(-0.8f, 0.21f, -1.28f, 1.03f, -1.08f, 1.83f)
                lineToRelative(2.02f, 7.96f)
                close()
            }
        }
        .build()
        return _handPeace!!
    }

private var _handPeace: ImageVector? = null
