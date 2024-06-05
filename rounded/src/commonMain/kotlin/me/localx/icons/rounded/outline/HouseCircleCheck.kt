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

public val Icons.Outline.HouseCircleCheck: ImageVector
    get() {
        if (_houseCircleCheck != null) {
            return _houseCircleCheck!!
        }
        _houseCircleCheck = Builder(name = "HouseCircleCheck", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 23.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-9.276f)
                curveToRelative(0.0f, -1.665f, 0.824f, -3.214f, 2.204f, -4.145f)
                lineTo(9.203f, 0.855f)
                curveToRelative(1.699f, -1.146f, 3.895f, -1.146f, 5.594f, 0.0f)
                lineToRelative(7.203f, 4.893f)
                curveToRelative(0.991f, 0.75f, 1.692f, 1.846f, 1.917f, 3.071f)
                curveToRelative(0.1f, 0.543f, -0.259f, 1.064f, -0.803f, 1.164f)
                curveToRelative(-0.544f, 0.104f, -1.064f, -0.26f, -1.164f, -0.803f)
                curveToRelative(-0.145f, -0.787f, -0.608f, -1.495f, -1.272f, -1.943f)
                lineToRelative(-7.0f, -4.724f)
                curveToRelative(-1.019f, -0.689f, -2.336f, -0.689f, -3.355f, 0.0f)
                lineTo(3.322f, 7.237f)
                curveToRelative(-0.828f, 0.559f, -1.322f, 1.487f, -1.322f, 2.486f)
                verticalLineToRelative(9.276f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(24.0f, 17.0f)
                curveToRelative(0.0f, 3.859f, -3.14f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.141f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.14f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.141f, 7.0f, 7.0f)
                close()
                moveTo(22.0f, 17.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveToRelative(-5.0f, 2.243f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.243f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.243f, 5.0f, -5.0f)
                close()
                moveTo(18.808f, 15.759f)
                lineToRelative(-2.223f, 2.134f)
                curveToRelative(-0.143f, 0.143f, -0.378f, 0.142f, -0.522f, 0.0f)
                lineToRelative(-1.132f, -1.108f)
                curveToRelative(-0.394f, -0.385f, -1.027f, -0.379f, -1.414f, 0.016f)
                curveToRelative(-0.387f, 0.395f, -0.38f, 1.027f, 0.015f, 1.414f)
                lineToRelative(1.132f, 1.108f)
                curveToRelative(0.459f, 0.449f, 1.062f, 0.674f, 1.664f, 0.674f)
                reflectiveCurveToRelative(1.201f, -0.225f, 1.653f, -0.671f)
                lineToRelative(2.212f, -2.124f)
                curveToRelative(0.398f, -0.383f, 0.412f, -1.016f, 0.029f, -1.414f)
                curveToRelative(-0.382f, -0.398f, -1.016f, -0.411f, -1.414f, -0.029f)
                close()
            }
        }
        .build()
        return _houseCircleCheck!!
    }

private var _houseCircleCheck: ImageVector? = null
