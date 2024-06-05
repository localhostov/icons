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

public val Icons.Bold.TransformationCircle: ImageVector
    get() {
        if (_transformationCircle != null) {
            return _transformationCircle!!
        }
        _transformationCircle = Builder(name = "TransformationCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 6.005f)
                curveToRelative(0.0f, -0.555f, -0.45f, -1.005f, -1.005f, -1.005f)
                horizontalLineToRelative(-3.262f)
                curveToRelative(-0.652f, 0.0f, -0.978f, 0.788f, -0.517f, 1.249f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-1.573f, 1.573f)
                curveToRelative(-1.377f, -0.961f, -3.047f, -1.529f, -4.85f, -1.529f)
                curveTo(3.813f, 7.0f, 0.0f, 10.813f, 0.0f, 15.5f)
                reflectiveCurveToRelative(3.813f, 8.5f, 8.5f, 8.5f)
                reflectiveCurveToRelative(8.5f, -3.813f, 8.5f, -8.5f)
                curveToRelative(0.0f, -1.803f, -0.568f, -3.473f, -1.529f, -4.85f)
                lineToRelative(1.573f, -1.573f)
                lineToRelative(0.707f, 0.707f)
                curveToRelative(0.461f, 0.461f, 1.249f, 0.134f, 1.249f, -0.517f)
                verticalLineToRelative(-3.262f)
                close()
                moveTo(8.5f, 21.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.468f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.467f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.468f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.467f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(24.0f, 8.5f)
                curveToRelative(0.0f, 2.237f, -0.862f, 4.35f, -2.429f, 5.948f)
                curveToRelative(-0.294f, 0.3f, -0.683f, 0.45f, -1.071f, 0.45f)
                curveToRelative(-0.379f, 0.0f, -0.758f, -0.143f, -1.05f, -0.429f)
                curveToRelative(-0.592f, -0.58f, -0.602f, -1.529f, -0.021f, -2.121f)
                curveToRelative(1.014f, -1.034f, 1.571f, -2.401f, 1.571f, -3.849f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                curveToRelative(-1.49f, 0.0f, -2.885f, 0.587f, -3.929f, 1.651f)
                curveToRelative(-0.579f, 0.592f, -1.528f, 0.603f, -2.121f, 0.021f)
                curveToRelative(-0.592f, -0.579f, -0.602f, -1.529f, -0.021f, -2.121f)
                curveToRelative(1.612f, -1.646f, 3.769f, -2.552f, 6.071f, -2.552f)
                curveToRelative(4.687f, 0.0f, 8.5f, 3.813f, 8.5f, 8.5f)
                close()
            }
        }
        .build()
        return _transformationCircle!!
    }

private var _transformationCircle: ImageVector? = null
