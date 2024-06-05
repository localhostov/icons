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

public val Icons.Bold.CircleDashed: ImageVector
    get() {
        if (_circleDashed != null) {
            return _circleDashed!!
        }
        _circleDashed = Builder(name = "CircleDashed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 4.67f)
                curveToRelative(0.63f, -0.81f, 1.36f, -1.54f, 2.17f, -2.17f)
                curveToRelative(0.66f, -0.51f, 1.6f, -0.39f, 2.1f, 0.27f)
                curveToRelative(0.51f, 0.66f, 0.39f, 1.6f, -0.27f, 2.1f)
                curveToRelative(-0.61f, 0.47f, -1.16f, 1.02f, -1.63f, 1.63f)
                curveToRelative(-0.29f, 0.38f, -0.74f, 0.58f, -1.19f, 0.58f)
                curveToRelative(-0.32f, 0.0f, -0.64f, -0.1f, -0.92f, -0.31f)
                curveToRelative(-0.66f, -0.51f, -0.78f, -1.45f, -0.27f, -2.1f)
                close()
                moveTo(6.51f, 19.13f)
                curveToRelative(-0.61f, -0.47f, -1.16f, -1.02f, -1.63f, -1.63f)
                curveToRelative(-0.51f, -0.66f, -1.45f, -0.78f, -2.1f, -0.27f)
                curveToRelative(-0.66f, 0.51f, -0.78f, 1.45f, -0.27f, 2.1f)
                curveToRelative(0.63f, 0.81f, 1.36f, 1.54f, 2.17f, 2.17f)
                curveToRelative(0.27f, 0.21f, 0.6f, 0.31f, 0.92f, 0.31f)
                curveToRelative(0.45f, 0.0f, 0.89f, -0.2f, 1.19f, -0.58f)
                curveToRelative(0.51f, -0.66f, 0.39f, -1.6f, -0.27f, -2.1f)
                close()
                moveTo(3.09f, 13.29f)
                curveToRelative(-0.06f, -0.42f, -0.09f, -0.86f, -0.09f, -1.29f)
                reflectiveCurveToRelative(0.03f, -0.86f, 0.09f, -1.29f)
                curveToRelative(0.12f, -0.82f, -0.46f, -1.58f, -1.27f, -1.7f)
                curveToRelative(-0.83f, -0.11f, -1.58f, 0.46f, -1.7f, 1.27f)
                curveToRelative(-0.08f, 0.56f, -0.12f, 1.14f, -0.12f, 1.71f)
                reflectiveCurveToRelative(0.04f, 1.14f, 0.12f, 1.71f)
                curveToRelative(0.11f, 0.75f, 0.75f, 1.29f, 1.48f, 1.29f)
                curveToRelative(0.07f, 0.0f, 0.14f, 0.0f, 0.21f, -0.01f)
                curveToRelative(0.82f, -0.12f, 1.39f, -0.88f, 1.27f, -1.7f)
                close()
                moveTo(21.23f, 17.23f)
                curveToRelative(-0.66f, -0.51f, -1.6f, -0.39f, -2.1f, 0.27f)
                curveToRelative(-0.47f, 0.61f, -1.02f, 1.16f, -1.63f, 1.63f)
                curveToRelative(-0.66f, 0.51f, -0.78f, 1.45f, -0.27f, 2.1f)
                curveToRelative(0.3f, 0.38f, 0.74f, 0.58f, 1.19f, 0.58f)
                curveToRelative(0.32f, 0.0f, 0.64f, -0.1f, 0.92f, -0.31f)
                curveToRelative(0.81f, -0.63f, 1.54f, -1.36f, 2.17f, -2.17f)
                curveToRelative(0.51f, -0.66f, 0.39f, -1.6f, -0.27f, -2.1f)
                close()
                moveTo(13.28f, 20.91f)
                curveToRelative(-0.42f, 0.06f, -0.86f, 0.09f, -1.29f, 0.09f)
                reflectiveCurveToRelative(-0.86f, -0.03f, -1.29f, -0.09f)
                curveToRelative(-0.83f, -0.11f, -1.58f, 0.46f, -1.7f, 1.27f)
                curveToRelative(-0.12f, 0.82f, 0.46f, 1.58f, 1.27f, 1.7f)
                curveToRelative(0.56f, 0.08f, 1.14f, 0.12f, 1.71f, 0.12f)
                reflectiveCurveToRelative(1.14f, -0.04f, 1.71f, -0.12f)
                curveToRelative(0.82f, -0.12f, 1.39f, -0.88f, 1.27f, -1.7f)
                curveToRelative(-0.12f, -0.82f, -0.87f, -1.39f, -1.7f, -1.27f)
                close()
                moveTo(13.71f, 0.12f)
                curveToRelative(-0.56f, -0.08f, -1.14f, -0.12f, -1.71f, -0.12f)
                reflectiveCurveToRelative(-1.14f, 0.04f, -1.71f, 0.12f)
                curveToRelative(-0.82f, 0.12f, -1.39f, 0.88f, -1.27f, 1.7f)
                curveToRelative(0.11f, 0.75f, 0.75f, 1.29f, 1.48f, 1.29f)
                curveToRelative(0.07f, 0.0f, 1.07f, -0.11f, 1.5f, -0.11f)
                reflectiveCurveToRelative(1.43f, 0.11f, 1.5f, 0.11f)
                curveToRelative(0.74f, 0.0f, 1.38f, -0.54f, 1.48f, -1.29f)
                curveToRelative(0.12f, -0.82f, -0.46f, -1.58f, -1.27f, -1.7f)
                close()
                moveTo(17.5f, 4.87f)
                curveToRelative(0.61f, 0.47f, 1.16f, 1.02f, 1.63f, 1.63f)
                curveToRelative(0.3f, 0.38f, 0.74f, 0.58f, 1.19f, 0.58f)
                curveToRelative(0.32f, 0.0f, 0.64f, -0.1f, 0.92f, -0.31f)
                curveToRelative(0.66f, -0.51f, 0.78f, -1.45f, 0.27f, -2.1f)
                curveToRelative(-0.63f, -0.81f, -1.36f, -1.54f, -2.17f, -2.17f)
                curveToRelative(-0.66f, -0.51f, -1.6f, -0.39f, -2.1f, 0.27f)
                curveToRelative(-0.51f, 0.66f, -0.39f, 1.6f, 0.27f, 2.1f)
                close()
                moveTo(23.89f, 10.29f)
                curveToRelative(-0.12f, -0.82f, -0.87f, -1.39f, -1.7f, -1.27f)
                curveToRelative(-0.82f, 0.12f, -1.39f, 0.88f, -1.27f, 1.7f)
                curveToRelative(0.06f, 0.42f, 0.09f, 0.86f, 0.09f, 1.29f)
                reflectiveCurveToRelative(-0.03f, 0.86f, -0.09f, 1.29f)
                curveToRelative(-0.12f, 0.82f, 0.46f, 1.58f, 1.27f, 1.7f)
                curveToRelative(0.07f, 0.0f, 0.14f, 0.01f, 0.21f, 0.01f)
                curveToRelative(0.74f, 0.0f, 1.38f, -0.54f, 1.48f, -1.29f)
                curveToRelative(0.08f, -0.56f, 0.12f, -1.14f, 0.12f, -1.71f)
                reflectiveCurveToRelative(-0.04f, -1.14f, -0.12f, -1.71f)
                close()
            }
        }
        .build()
        return _circleDashed!!
    }

private var _circleDashed: ImageVector? = null
