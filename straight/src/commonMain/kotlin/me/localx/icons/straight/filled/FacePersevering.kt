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

public val Icons.Filled.FacePersevering: ImageVector
    get() {
        if (_facePersevering != null) {
            return _facePersevering!!
        }
        _facePersevering = Builder(name = "FacePersevering", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(4.629f, 7.477f)
                curveToRelative(1.188f, -0.474f, 2.267f, -1.373f, 3.039f, -2.531f)
                lineToRelative(1.664f, 1.109f)
                curveToRelative(-1.01f, 1.514f, -2.38f, 2.648f, -3.963f, 3.279f)
                lineToRelative(-0.74f, -1.857f)
                close()
                moveTo(6.375f, 14.219f)
                lineToRelative(1.524f, -1.219f)
                lineToRelative(-1.524f, -1.219f)
                lineToRelative(1.25f, -1.562f)
                lineToRelative(3.476f, 2.781f)
                lineToRelative(-3.476f, 2.781f)
                lineToRelative(-1.25f, -1.562f)
                close()
                moveTo(14.402f, 18.802f)
                curveToRelative(-0.007f, -0.005f, -1.113f, -0.802f, -2.402f, -0.802f)
                reflectiveCurveToRelative(-2.396f, 0.797f, -2.406f, 0.805f)
                lineToRelative(-1.191f, -1.606f)
                curveToRelative(0.066f, -0.049f, 1.632f, -1.198f, 3.598f, -1.198f)
                reflectiveCurveToRelative(3.531f, 1.149f, 3.598f, 1.198f)
                lineToRelative(-1.195f, 1.604f)
                close()
                moveTo(17.625f, 14.219f)
                lineToRelative(-1.25f, 1.562f)
                lineToRelative(-3.476f, -2.781f)
                lineToRelative(3.476f, -2.781f)
                lineToRelative(1.25f, 1.562f)
                lineToRelative(-1.524f, 1.219f)
                lineToRelative(1.524f, 1.219f)
                close()
                moveTo(18.631f, 9.334f)
                curveToRelative(-1.583f, -0.631f, -2.953f, -1.766f, -3.963f, -3.279f)
                lineToRelative(1.664f, -1.109f)
                curveToRelative(0.772f, 1.158f, 1.852f, 2.058f, 3.039f, 2.531f)
                lineToRelative(-0.74f, 1.857f)
                close()
            }
        }
        .build()
        return _facePersevering!!
    }

private var _facePersevering: ImageVector? = null
