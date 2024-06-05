package me.localx.icons.straight.outline

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

public val Icons.Outline.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) {
            return _cameraRotate!!
        }
        _cameraRotate = Builder(name = "CameraRotate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 4.0f)
                horizontalLineToRelative(-2.5f)
                lineTo(15.5f, 0.0f)
                horizontalLineToRelative(-7.0f)
                lineToRelative(-3.0f, 4.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(9.5f, 2.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(1.5f, 2.0f)
                lineTo(8.0f, 4.0f)
                lineToRelative(1.5f, -2.0f)
                close()
                moveTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 7.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(15.957f, 15.0f)
                horizontalLineToRelative(2.043f)
                curveToRelative(-0.477f, 2.834f, -2.948f, 5.0f, -5.916f, 5.0f)
                curveToRelative(-1.661f, 0.0f, -3.188f, -0.67f, -4.289f, -1.795f)
                lineToRelative(-1.795f, 1.795f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(-1.789f, 1.789f)
                curveToRelative(0.735f, 0.758f, 1.759f, 1.211f, 2.873f, 1.211f)
                curveToRelative(1.86f, 0.0f, 3.428f, -1.276f, 3.873f, -3.0f)
                close()
                moveTo(16.205f, 9.795f)
                lineToRelative(1.795f, -1.795f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(1.789f, -1.789f)
                curveToRelative(-0.735f, -0.758f, -1.759f, -1.211f, -2.873f, -1.211f)
                curveToRelative(-1.86f, 0.0f, -3.428f, 1.276f, -3.873f, 3.0f)
                horizontalLineToRelative(-2.043f)
                curveToRelative(0.477f, -2.834f, 2.948f, -5.0f, 5.916f, -5.0f)
                curveToRelative(1.661f, 0.0f, 3.188f, 0.67f, 4.289f, 1.795f)
                close()
            }
        }
        .build()
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
