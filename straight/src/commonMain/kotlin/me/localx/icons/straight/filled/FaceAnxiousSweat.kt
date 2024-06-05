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

public val Icons.Filled.FaceAnxiousSweat: ImageVector
    get() {
        if (_faceAnxiousSweat != null) {
            return _faceAnxiousSweat!!
        }
        _faceAnxiousSweat = Builder(name = "FaceAnxiousSweat", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                curveToRelative(0.0f, 0.455f, 0.031f, 0.902f, 0.08f, 1.344f)
                curveToRelative(0.415f, -1.879f, 2.42f, -3.858f, 2.42f, -3.858f)
                curveToRelative(0.0f, 0.0f, 2.5f, 2.513f, 2.5f, 4.5f)
                curveToRelative(0.0f, 1.381f, -1.119f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-0.81f, 0.0f, -1.522f, -0.391f, -1.979f, -0.988f)
                curveToRelative(1.498f, 4.921f, 6.068f, 8.502f, 11.479f, 8.502f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(4.629f, 8.571f)
                curveToRelative(1.187f, -0.474f, 2.266f, -1.372f, 3.039f, -2.531f)
                lineToRelative(1.664f, 1.109f)
                curveToRelative(-1.01f, 1.515f, -2.38f, 2.648f, -3.962f, 3.279f)
                lineToRelative(-0.741f, -1.857f)
                close()
                moveTo(7.0f, 12.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(8.0f, 19.0f)
                curveToRelative(0.0f, -2.209f, 1.791f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.791f, 4.0f, 4.0f)
                lineTo(8.0f, 19.0f)
                close()
                moveTo(15.5f, 14.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(18.63f, 10.429f)
                curveToRelative(-1.582f, -0.631f, -2.952f, -1.765f, -3.962f, -3.279f)
                lineToRelative(1.664f, -1.109f)
                curveToRelative(0.773f, 1.159f, 1.852f, 2.058f, 3.039f, 2.531f)
                lineToRelative(-0.741f, 1.857f)
                close()
            }
        }
        .build()
        return _faceAnxiousSweat!!
    }

private var _faceAnxiousSweat: ImageVector? = null
