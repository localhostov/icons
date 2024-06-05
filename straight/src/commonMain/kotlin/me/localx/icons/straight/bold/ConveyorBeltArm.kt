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

public val Icons.Bold.ConveyorBeltArm: ImageVector
    get() {
        if (_conveyorBeltArm != null) {
            return _conveyorBeltArm!!
        }
        _conveyorBeltArm = Builder(name = "ConveyorBeltArm", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 15.051f)
                verticalLineToRelative(-3.051f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                lineTo(4.0f, 12.0f)
                verticalLineToRelative(3.051f)
                curveToRelative(-2.244f, 0.252f, -4.0f, 2.139f, -4.0f, 4.449f)
                curveToRelative(0.0f, 2.481f, 2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                curveToRelative(0.0f, -2.31f, -1.756f, -4.197f, -4.0f, -4.449f)
                close()
                moveTo(15.276f, 18.0f)
                curveToRelative(-0.168f, 0.471f, -0.276f, 0.971f, -0.276f, 1.5f)
                reflectiveCurveToRelative(0.108f, 1.029f, 0.276f, 1.5f)
                horizontalLineToRelative(-6.553f)
                curveToRelative(0.168f, -0.471f, 0.276f, -0.971f, 0.276f, -1.5f)
                reflectiveCurveToRelative(-0.108f, -1.029f, -0.276f, -1.5f)
                horizontalLineToRelative(6.553f)
                close()
                moveTo(3.0f, 19.5f)
                curveToRelative(0.0f, -0.827f, 0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.673f, -1.5f, -1.5f)
                close()
                moveTo(19.5f, 21.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(24.0f, 0.0f)
                lineTo(24.0f, 3.0f)
                lineTo(7.0f, 3.0f)
                verticalLineToRelative(1.248f)
                lineToRelative(8.947f, 1.627f)
                curveToRelative(1.189f, 0.216f, 2.053f, 1.25f, 2.053f, 2.459f)
                verticalLineToRelative(1.666f)
                horizontalLineToRelative(-1.5f)
                reflectiveCurveToRelative(0.0f, -1.5f, -1.0f, -1.5f)
                reflectiveCurveToRelative(-1.0f, 1.5f, -1.0f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.612f)
                lineToRelative(-9.0f, -1.636f)
                lineTo(4.0f, 3.0f)
                lineTo(0.0f, 3.0f)
                lineTo(0.0f, 0.0f)
                lineTo(24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _conveyorBeltArm!!
    }

private var _conveyorBeltArm: ImageVector? = null
