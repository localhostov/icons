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

public val Icons.Filled.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) {
            return _cameraRotate!!
        }
        _cameraRotate = Builder(name = "CameraRotate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.28f, 3.0f)
                lineToRelative(2.314f, -3.0f)
                horizontalLineToRelative(6.813f)
                lineToRelative(2.314f, 3.0f)
                lineTo(6.28f, 3.0f)
                close()
                moveTo(24.0f, 8.0f)
                verticalLineToRelative(16.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 8.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(18.0f, 16.0f)
                horizontalLineToRelative(-2.043f)
                curveToRelative(-0.445f, 1.724f, -2.013f, 3.0f, -3.873f, 3.0f)
                curveToRelative(-1.114f, 0.0f, -2.138f, -0.453f, -2.873f, -1.211f)
                lineToRelative(1.789f, -1.789f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(5.0f)
                lineToRelative(1.795f, -1.795f)
                curveToRelative(1.1f, 1.125f, 2.628f, 1.795f, 4.289f, 1.795f)
                curveToRelative(2.968f, 0.0f, 5.439f, -2.166f, 5.916f, -5.0f)
                close()
                moveTo(18.0f, 9.0f)
                lineToRelative(-1.795f, 1.795f)
                curveToRelative(-1.1f, -1.125f, -2.628f, -1.795f, -4.289f, -1.795f)
                curveToRelative(-2.968f, 0.0f, -5.439f, 2.166f, -5.916f, 5.0f)
                horizontalLineToRelative(2.043f)
                curveToRelative(0.445f, -1.724f, 2.013f, -3.0f, 3.873f, -3.0f)
                curveToRelative(1.114f, 0.0f, 2.138f, 0.453f, 2.873f, 1.211f)
                lineToRelative(-1.789f, 1.789f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
