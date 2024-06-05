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

public val Icons.Filled.SignatureLock: ImageVector
    get() {
        if (_signatureLock != null) {
            return _signatureLock!!
        }
        _signatureLock = Builder(name = "SignatureLock", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 15.0f)
                curveToRelative(0.07f, 0.0f, -0.07f, 0.01f, 0.0f, 0.0f)
                lineTo(1.0f, 15.0f)
                close()
                moveTo(9.0f, 17.0f)
                lineTo(1.0f, 17.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                lineTo(9.0f, 19.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(15.33f, 6.5f)
                curveToRelative(0.19f, 0.32f, 0.52f, 0.5f, 0.87f, 0.5f)
                curveToRelative(0.17f, 0.0f, 0.34f, -0.04f, 0.5f, -0.13f)
                curveToRelative(0.48f, -0.28f, 0.64f, -0.89f, 0.36f, -1.37f)
                curveToRelative(-0.37f, -0.64f, -0.84f, -1.22f, -1.4f, -1.72f)
                curveToRelative(-0.41f, -0.37f, -1.04f, -0.33f, -1.41f, 0.08f)
                curveToRelative(-0.37f, 0.41f, -0.33f, 1.04f, 0.08f, 1.41f)
                curveToRelative(0.4f, 0.35f, 0.73f, 0.77f, 1.0f, 1.23f)
                close()
                moveTo(24.0f, 18.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.47f, 0.81f, -2.75f, 2.0f, -3.44f)
                verticalLineToRelative(-1.56f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                verticalLineToRelative(1.56f)
                curveToRelative(1.19f, 0.69f, 2.0f, 1.97f, 2.0f, 3.44f)
                close()
                moveTo(19.5f, 19.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(20.0f, 13.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(2.93f, 11.8f)
                curveTo(1.16f, 9.46f, 0.0f, 6.31f, 0.0f, 4.0f)
                reflectiveCurveTo(1.79f, 0.0f, 4.0f, 0.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-0.85f, 5.41f, -2.46f, 7.74f)
                curveToRelative(0.8f, 0.77f, 1.65f, 1.26f, 2.46f, 1.26f)
                curveToRelative(0.6f, 0.0f, 1.13f, -0.11f, 1.58f, -0.29f)
                curveToRelative(-0.97f, -1.15f, -1.58f, -2.55f, -1.58f, -3.71f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f)
                curveToRelative(0.0f, 2.49f, -1.86f, 6.0f, -6.0f, 6.0f)
                curveToRelative(-1.33f, 0.0f, -2.61f, -0.67f, -3.75f, -1.72f)
                curveToRelative(-0.88f, 0.84f, -1.72f, 1.45f, -3.26f, 1.72f)
                curveToRelative(-0.46f, 0.0f, -0.88f, -0.32f, -0.98f, -0.79f)
                curveToRelative(-0.11f, -0.54f, 0.23f, -1.07f, 0.77f, -1.18f)
                curveToRelative(0.79f, -0.17f, 1.5f, -0.61f, 2.14f, -1.22f)
                close()
                moveTo(10.0f, 9.0f)
                curveToRelative(0.0f, 0.61f, 0.4f, 1.6f, 1.15f, 2.47f)
                curveToRelative(0.61f, -0.83f, 0.85f, -1.82f, 0.85f, -2.47f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                close()
                moveTo(4.21f, 10.15f)
                curveToRelative(1.14f, -1.89f, 1.79f, -4.32f, 1.79f, -6.15f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                curveToRelative(0.0f, 1.85f, 0.93f, 4.28f, 2.21f, 6.15f)
                close()
            }
        }
        .build()
        return _signatureLock!!
    }

private var _signatureLock: ImageVector? = null
