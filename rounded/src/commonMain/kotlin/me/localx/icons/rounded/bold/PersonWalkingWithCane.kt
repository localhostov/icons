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

public val Icons.Bold.PersonWalkingWithCane: ImageVector
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
                moveTo(6.42f, 18.06f)
                curveToRelative(-0.79f, -0.23f, -1.63f, 0.23f, -1.86f, 1.02f)
                lineToRelative(-0.87f, 3.0f)
                curveToRelative(-0.23f, 0.8f, 0.23f, 1.63f, 1.02f, 1.86f)
                curveToRelative(0.14f, 0.04f, 0.28f, 0.06f, 0.42f, 0.06f)
                curveToRelative(0.65f, 0.0f, 1.25f, -0.43f, 1.44f, -1.08f)
                lineToRelative(0.87f, -3.0f)
                curveToRelative(0.23f, -0.8f, -0.23f, -1.63f, -1.02f, -1.86f)
                close()
                moveTo(23.81f, 21.77f)
                lineToRelative(-4.5f, -8.0f)
                curveToRelative(-0.1f, -0.18f, -0.24f, -0.34f, -0.41f, -0.46f)
                lineToRelative(-3.85f, -2.89f)
                lineToRelative(-1.84f, -2.3f)
                curveToRelative(-1.0f, -1.5f, -2.17f, -2.12f, -3.99f, -2.12f)
                horizontalLineToRelative(-0.96f)
                curveToRelative(-1.9f, 0.0f, -3.03f, 0.62f, -4.01f, 2.17f)
                lineTo(1.25f, 12.67f)
                curveToRelative(-0.46f, 0.69f, -0.27f, 1.62f, 0.42f, 2.08f)
                curveToRelative(0.69f, 0.46f, 1.62f, 0.27f, 2.08f, -0.42f)
                lineToRelative(2.25f, -3.38f)
                verticalLineToRelative(2.18f)
                curveToRelative(0.0f, 1.53f, 0.77f, 2.94f, 2.05f, 3.77f)
                lineToRelative(3.25f, 2.11f)
                lineToRelative(1.83f, 4.1f)
                curveToRelative(0.25f, 0.56f, 0.8f, 0.89f, 1.37f, 0.89f)
                curveToRelative(0.2f, 0.0f, 0.41f, -0.04f, 0.61f, -0.13f)
                curveToRelative(0.76f, -0.34f, 1.1f, -1.23f, 0.76f, -1.98f)
                lineToRelative(-2.01f, -4.5f)
                curveToRelative(-0.12f, -0.26f, -0.31f, -0.49f, -0.55f, -0.65f)
                lineToRelative(-2.31f, -1.5f)
                verticalLineToRelative(-5.09f)
                lineToRelative(1.83f, 2.29f)
                curveToRelative(0.08f, 0.1f, 0.17f, 0.19f, 0.27f, 0.26f)
                lineToRelative(3.75f, 2.81f)
                lineToRelative(4.34f, 7.72f)
                curveToRelative(0.28f, 0.49f, 0.78f, 0.77f, 1.31f, 0.77f)
                curveToRelative(0.25f, 0.0f, 0.5f, -0.06f, 0.73f, -0.19f)
                curveToRelative(0.72f, -0.41f, 0.98f, -1.32f, 0.57f, -2.04f)
                close()
            }
        }
        .build()
        return _personWalkingWithCane!!
    }

private var _personWalkingWithCane: ImageVector? = null
