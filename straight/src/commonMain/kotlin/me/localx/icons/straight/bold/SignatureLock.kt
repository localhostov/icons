package me.localx.icons.straight.bold

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

public val Icons.Bold.SignatureLock: ImageVector
    get() {
        if (_signatureLock != null) {
            return _signatureLock!!
        }
        _signatureLock = Builder(name = "SignatureLock", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.0f, 0.47f, 2.01f, 0.96f, 2.85f)
                curveToRelative(-0.29f, 0.1f, -0.6f, 0.15f, -0.96f, 0.15f)
                curveToRelative(-0.62f, 0.0f, -1.26f, -0.33f, -1.87f, -0.87f)
                curveToRelative(1.27f, -2.17f, 1.87f, -4.87f, 1.87f, -7.13f)
                reflectiveCurveTo(6.21f, 0.0f, 4.0f, 0.0f)
                reflectiveCurveTo(0.0f, 1.79f, 0.0f, 4.0f)
                reflectiveCurveToRelative(0.84f, 4.97f, 2.26f, 7.17f)
                curveToRelative(-0.63f, 0.52f, -1.36f, 0.83f, -2.2f, 0.83f)
                verticalLineToRelative(3.0f)
                curveToRelative(1.66f, 0.0f, 3.04f, -0.59f, 4.16f, -1.54f)
                curveToRelative(1.11f, 0.95f, 2.38f, 1.54f, 3.78f, 1.54f)
                curveToRelative(3.71f, 0.0f, 6.0f, -3.11f, 6.0f, -6.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(4.15f, 8.36f)
                curveToRelative(-0.7f, -1.42f, -1.15f, -3.02f, -1.15f, -4.36f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                curveToRelative(0.0f, 1.37f, -0.29f, 2.96f, -0.85f, 4.36f)
                close()
                moveTo(0.0f, 17.0f)
                lineTo(11.0f, 17.0f)
                verticalLineToRelative(3.0f)
                lineTo(0.0f, 20.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(23.0f, 15.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(17.0f, 13.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(20.0f, 21.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(14.8f, 5.63f)
                lineToRelative(-0.33f, -0.38f)
                lineToRelative(2.27f, -1.96f)
                lineToRelative(0.33f, 0.38f)
                curveToRelative(0.82f, 0.95f, 1.45f, 2.08f, 1.86f, 3.35f)
                curveToRelative(-0.14f, 0.0f, -0.29f, -0.02f, -0.44f, -0.02f)
                curveToRelative(-0.92f, 0.0f, -1.79f, 0.19f, -2.58f, 0.54f)
                curveToRelative(-0.29f, -0.73f, -0.66f, -1.38f, -1.12f, -1.9f)
                close()
            }
        }
        .build()
        return _signatureLock!!
    }

private var _signatureLock: ImageVector? = null
