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
                moveTo(23.97f, 23.04f)
                lineToRelative(-1.76f, 0.94f)
                lineToRelative(-4.99f, -9.32f)
                lineToRelative(-3.96f, -2.97f)
                lineToRelative(-2.12f, -3.24f)
                curveToRelative(-0.04f, -0.06f, -0.08f, -0.11f, -0.13f, -0.16f)
                verticalLineToRelative(7.87f)
                lineToRelative(1.76f, 1.14f)
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
                moveTo(5.96f, 17.64f)
                lineToRelative(-1.09f, 6.36f)
                horizontalLineToRelative(2.04f)
                lineToRelative(0.85f, -5.17f)
                reflectiveCurveToRelative(-1.75f, -1.15f, -1.8f, -1.19f)
                close()
            }
        }
        .build()
        return _personWalkingWithCane!!
    }

private var _personWalkingWithCane: ImageVector? = null
