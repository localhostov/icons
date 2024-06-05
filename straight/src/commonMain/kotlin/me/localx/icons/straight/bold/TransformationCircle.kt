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
                moveToRelative(24.0f, 8.5f)
                curveToRelative(0.0f, 3.453f, -2.074f, 6.427f, -5.038f, 7.755f)
                curveToRelative(0.018f, -0.25f, 0.038f, -0.5f, 0.038f, -0.755f)
                curveToRelative(0.0f, -0.871f, -0.118f, -1.712f, -0.319f, -2.522f)
                curveToRelative(1.401f, -0.998f, 2.319f, -2.632f, 2.319f, -4.478f)
                curveToRelative(0.0f, -3.032f, -2.468f, -5.5f, -5.5f, -5.5f)
                curveToRelative(-1.847f, 0.0f, -3.48f, 0.918f, -4.478f, 2.319f)
                curveToRelative(-0.809f, -0.201f, -1.651f, -0.319f, -2.522f, -0.319f)
                curveToRelative(-0.255f, 0.0f, -0.505f, 0.02f, -0.755f, 0.038f)
                curveTo(9.073f, 2.074f, 12.046f, 0.0f, 15.5f, 0.0f)
                curveToRelative(4.687f, 0.0f, 8.5f, 3.813f, 8.5f, 8.5f)
                close()
                moveTo(15.471f, 10.65f)
                curveToRelative(0.961f, 1.377f, 1.529f, 3.047f, 1.529f, 4.85f)
                curveToRelative(0.0f, 4.687f, -3.813f, 8.5f, -8.5f, 8.5f)
                reflectiveCurveTo(0.0f, 20.187f, 0.0f, 15.5f)
                reflectiveCurveTo(3.813f, 7.0f, 8.5f, 7.0f)
                curveToRelative(1.803f, 0.0f, 3.473f, 0.568f, 4.85f, 1.529f)
                lineToRelative(1.84f, -1.84f)
                lineToRelative(-1.689f, -1.689f)
                horizontalLineToRelative(4.583f)
                curveToRelative(0.506f, 0.0f, 0.917f, 0.41f, 0.917f, 0.917f)
                verticalLineToRelative(4.583f)
                lineToRelative(-1.689f, -1.689f)
                lineToRelative(-1.84f, 1.84f)
                close()
                moveTo(14.0f, 15.5f)
                curveToRelative(0.0f, -3.032f, -2.467f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.468f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.467f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.468f, 5.5f, -5.5f)
                close()
            }
        }
        .build()
        return _transformationCircle!!
    }

private var _transformationCircle: ImageVector? = null
