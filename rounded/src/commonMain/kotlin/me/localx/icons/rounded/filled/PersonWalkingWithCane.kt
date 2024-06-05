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

public val Icons.Filled.PersonWalkingWithCane: ImageVector
    get() {
        if (_personWalkingWithCane != null) {
            return _personWalkingWithCane!!
        }
        _personWalkingWithCane = Builder(name = "PersonWalkingWithCane", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.01f, 2.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(23.49f, 23.87f)
                curveToRelative(-0.15f, 0.09f, -0.32f, 0.13f, -0.48f, 0.13f)
                curveToRelative(-0.35f, 0.0f, -0.69f, -0.19f, -0.88f, -0.51f)
                lineToRelative(-4.9f, -8.81f)
                lineToRelative(-3.83f, -2.87f)
                curveToRelative(-0.09f, -0.07f, -0.17f, -0.16f, -0.24f, -0.25f)
                lineToRelative(-1.43f, -2.19f)
                curveToRelative(-0.2f, -0.3f, -0.45f, -0.57f, -0.73f, -0.77f)
                curveToRelative(0.0f, 0.0f, 0.0f, 7.52f, -0.01f, 7.57f)
                lineToRelative(1.56f, 1.01f)
                curveToRelative(0.14f, 0.09f, 0.26f, 0.22f, 0.34f, 0.36f)
                lineToRelative(2.69f, 5.0f)
                curveToRelative(0.26f, 0.49f, 0.08f, 1.09f, -0.41f, 1.35f)
                curveToRelative(-0.15f, 0.08f, -0.31f, 0.12f, -0.47f, 0.12f)
                curveToRelative(-0.36f, 0.0f, -0.7f, -0.19f, -0.88f, -0.53f)
                lineToRelative(-2.57f, -4.77f)
                lineToRelative(-3.41f, -2.21f)
                curveToRelative(-1.14f, -0.74f, -1.82f, -2.0f, -1.82f, -3.36f)
                verticalLineToRelative(-4.11f)
                curveToRelative(-0.1f, 0.12f, -0.2f, 0.24f, -0.28f, 0.38f)
                lineToRelative(-3.24f, 5.13f)
                curveToRelative(-0.29f, 0.47f, -0.91f, 0.61f, -1.38f, 0.31f)
                curveToRelative(-0.47f, -0.29f, -0.61f, -0.91f, -0.31f, -1.38f)
                lineToRelative(3.24f, -5.13f)
                curveToRelative(0.92f, -1.46f, 2.5f, -2.33f, 4.23f, -2.33f)
                horizontalLineToRelative(0.96f)
                curveToRelative(1.69f, 0.0f, 3.26f, 0.85f, 4.18f, 2.26f)
                lineToRelative(1.33f, 2.04f)
                lineToRelative(3.86f, 2.89f)
                curveToRelative(0.11f, 0.08f, 0.21f, 0.19f, 0.27f, 0.31f)
                lineToRelative(5.0f, 9.0f)
                curveToRelative(0.27f, 0.48f, 0.09f, 1.09f, -0.39f, 1.36f)
                close()
                moveTo(6.82f, 18.01f)
                curveToRelative(-0.55f, -0.09f, -1.06f, 0.28f, -1.15f, 0.83f)
                lineToRelative(-0.65f, 4.0f)
                curveToRelative(-0.09f, 0.55f, 0.28f, 1.06f, 0.83f, 1.15f)
                curveToRelative(0.05f, 0.0f, 0.11f, 0.01f, 0.16f, 0.01f)
                curveToRelative(0.48f, 0.0f, 0.91f, -0.35f, 0.99f, -0.84f)
                lineToRelative(0.65f, -4.0f)
                curveToRelative(0.09f, -0.55f, -0.28f, -1.06f, -0.83f, -1.15f)
                close()
            }
        }
        .build()
        return _personWalkingWithCane!!
    }

private var _personWalkingWithCane: ImageVector? = null
