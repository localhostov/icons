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

public val Icons.Outline.PersonWalkingWithCane: ImageVector
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
                moveTo(23.97f, 23.04f)
                lineToRelative(-1.76f, 0.94f)
                lineToRelative(-4.99f, -9.32f)
                lineToRelative(-3.96f, -2.97f)
                lineToRelative(-1.25f, -1.91f)
                verticalLineToRelative(7.03f)
                lineToRelative(0.76f, 0.49f)
                lineToRelative(2.9f, 5.75f)
                lineToRelative(-1.79f, 0.9f)
                lineToRelative(-2.66f, -5.27f)
                lineToRelative(-5.22f, -3.39f)
                verticalLineToRelative(-6.35f)
                lineTo(1.86f, 15.53f)
                lineTo(0.16f, 14.47f)
                lineTo(4.62f, 7.4f)
                curveToRelative(0.55f, -0.88f, 1.5f, -1.4f, 2.54f, -1.4f)
                horizontalLineToRelative(3.14f)
                curveToRelative(1.02f, 0.0f, 1.96f, 0.51f, 2.51f, 1.36f)
                lineToRelative(1.93f, 2.95f)
                lineToRelative(4.04f, 3.03f)
                lineToRelative(5.19f, 9.71f)
                close()
                moveTo(10.01f, 15.52f)
                verticalLineToRelative(-7.52f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.22f)
                lineToRelative(2.0f, 1.3f)
                close()
                moveTo(4.87f, 24.0f)
                horizontalLineToRelative(2.04f)
                lineToRelative(0.85f, -5.17f)
                reflectiveCurveToRelative(-1.75f, -1.15f, -1.8f, -1.19f)
                lineToRelative(-1.09f, 6.36f)
                close()
            }
        }
        .build()
        return _personWalkingWithCane!!
    }

private var _personWalkingWithCane: ImageVector? = null
