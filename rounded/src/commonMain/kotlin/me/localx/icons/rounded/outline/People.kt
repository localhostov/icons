package me.localx.icons.rounded.outline

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

public val Icons.Outline.People: ImageVector
    get() {
        if (_people != null) {
            return _people!!
        }
        _people = Builder(name = "People", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 2.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(11.0f, 10.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.48f, -0.81f, 2.77f, -2.0f, 3.46f)
                verticalLineToRelative(6.54f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-6.54f)
                curveToRelative(-1.19f, -0.69f, -2.0f, -1.99f, -2.0f, -3.46f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                close()
                moveTo(9.0f, 10.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(18.0f, 5.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(22.25f, 18.99f)
                curveToRelative(-0.34f, 0.39f, -0.77f, 0.67f, -1.25f, 0.84f)
                verticalLineToRelative(3.17f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-3.17f)
                curveToRelative(-0.48f, -0.17f, -0.91f, -0.46f, -1.25f, -0.84f)
                curveToRelative(-0.57f, -0.65f, -0.83f, -1.5f, -0.73f, -2.36f)
                lineToRelative(0.88f, -7.01f)
                curveToRelative(0.26f, -2.06f, 2.02f, -3.62f, 4.1f, -3.62f)
                reflectiveCurveToRelative(3.84f, 1.56f, 4.1f, 3.62f)
                lineToRelative(0.88f, 7.01f)
                curveToRelative(0.11f, 0.85f, -0.16f, 1.71f, -0.73f, 2.36f)
                close()
                moveTo(20.99f, 16.88f)
                lineToRelative(-0.88f, -7.01f)
                curveToRelative(-0.13f, -1.07f, -1.04f, -1.87f, -2.12f, -1.87f)
                reflectiveCurveToRelative(-1.98f, 0.8f, -2.12f, 1.87f)
                lineToRelative(-0.88f, 7.01f)
                curveToRelative(-0.04f, 0.29f, 0.05f, 0.57f, 0.24f, 0.79f)
                curveToRelative(0.19f, 0.22f, 0.46f, 0.34f, 0.75f, 0.34f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.29f, 0.0f, 0.56f, -0.12f, 0.75f, -0.34f)
                curveToRelative(0.19f, -0.22f, 0.28f, -0.5f, 0.24f, -0.79f)
                close()
            }
        }
        .build()
        return _people!!
    }

private var _people: ImageVector? = null