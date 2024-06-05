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

public val Icons.Filled.HandsClapping: ImageVector
    get() {
        if (_handsClapping != null) {
            return _handsClapping!!
        }
        _handsClapping = Builder(name = "HandsClapping", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 15.75f)
                curveToRelative(0.0f, 2.16f, -0.84f, 4.19f, -2.37f, 5.72f)
                curveToRelative(-1.69f, 1.69f, -3.91f, 2.54f, -6.13f, 2.54f)
                reflectiveCurveToRelative(-4.44f, -0.84f, -6.13f, -2.54f)
                lineTo(0.44f, 18.54f)
                curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0.0f, -2.12f)
                reflectiveCurveToRelative(1.54f, -0.59f, 2.12f, 0.0f)
                lineToRelative(1.76f, 1.76f)
                lineToRelative(0.88f, -0.88f)
                lineTo(0.44f, 12.54f)
                curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0.0f, -2.12f)
                curveToRelative(0.59f, -0.59f, 1.54f, -0.59f, 2.12f, 0.0f)
                lineToRelative(4.76f, 4.76f)
                lineToRelative(0.88f, -0.88f)
                lineTo(2.44f, 8.54f)
                curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0.0f, -2.12f)
                curveToRelative(0.59f, -0.59f, 1.54f, -0.59f, 2.12f, 0.0f)
                lineToRelative(5.76f, 5.76f)
                lineToRelative(0.88f, -0.88f)
                lineToRelative(-3.76f, -3.76f)
                curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0.0f, -2.12f)
                curveToRelative(0.59f, -0.59f, 1.54f, -0.59f, 2.12f, 0.0f)
                lineToRelative(4.44f, 4.44f)
                verticalLineToRelative(-1.85f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(7.75f)
                close()
                moveTo(22.0f, 6.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.0f, -0.66f, 3.48f, -0.74f, 3.55f)
                curveToRelative(-0.5f, 1.23f, -1.25f, 2.36f, -2.21f, 3.33f)
                curveToRelative(-0.41f, 0.41f, -0.86f, 0.78f, -1.32f, 1.11f)
                curveToRelative(2.15f, -0.05f, 4.27f, -0.89f, 5.91f, -2.52f)
                curveToRelative(1.53f, -1.53f, 2.37f, -3.56f, 2.37f, -5.72f)
                verticalLineToRelative(-7.75f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(13.71f, 1.71f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.29f, -2.29f)
                close()
                moveTo(5.96f, 2.55f)
                lineTo(3.71f, 0.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.25f, 2.25f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(9.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(7.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(9.0f, 0.0f)
                close()
            }
        }
        .build()
        return _handsClapping!!
    }

private var _handsClapping: ImageVector? = null
