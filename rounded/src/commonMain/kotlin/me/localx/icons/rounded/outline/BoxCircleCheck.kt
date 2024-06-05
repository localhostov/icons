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

public val Icons.Outline.BoxCircleCheck: ImageVector
    get() {
        if (_boxCircleCheck != null) {
            return _boxCircleCheck!!
        }
        _boxCircleCheck = Builder(name = "BoxCircleCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                curveTo(1.794f, 0.0f, 0.0f, 1.794f, 0.0f, 4.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.886f, 0.387f, 1.684f, 1.0f, 2.234f)
                verticalLineToRelative(11.766f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.766f)
                curveToRelative(0.613f, -0.55f, 1.0f, -1.347f, 1.0f, -2.234f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                close()
                moveTo(3.0f, 6.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.551f, -0.449f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 6.0f)
                close()
                moveTo(17.0f, 10.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(17.0f, 22.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(20.221f, 15.788f)
                curveToRelative(0.383f, 0.398f, 0.37f, 1.031f, -0.029f, 1.414f)
                lineToRelative(-2.212f, 2.124f)
                curveToRelative(-0.453f, 0.447f, -1.052f, 0.671f, -1.653f, 0.671f)
                reflectiveCurveToRelative(-1.204f, -0.224f, -1.664f, -0.674f)
                lineToRelative(-1.132f, -1.107f)
                curveToRelative(-0.395f, -0.387f, -0.401f, -1.02f, -0.015f, -1.415f)
                curveToRelative(0.388f, -0.393f, 1.021f, -0.4f, 1.415f, -0.015f)
                lineToRelative(1.132f, 1.108f)
                curveToRelative(0.144f, 0.143f, 0.378f, 0.141f, 0.522f, 0.0f)
                lineToRelative(2.223f, -2.134f)
                curveToRelative(0.398f, -0.383f, 1.031f, -0.37f, 1.414f, 0.029f)
                close()
            }
        }
        .build()
        return _boxCircleCheck!!
    }

private var _boxCircleCheck: ImageVector? = null
