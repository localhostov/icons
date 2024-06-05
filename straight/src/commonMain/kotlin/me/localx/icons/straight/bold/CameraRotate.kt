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

public val Icons.Bold.CameraRotate: ImageVector
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
                horizontalLineToRelative(-2.25f)
                lineTo(15.75f, 0.0f)
                horizontalLineToRelative(-7.5f)
                lineToRelative(-3.0f, 4.0f)
                horizontalLineToRelative(-2.25f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 7.0f)
                horizontalLineToRelative(3.75f)
                lineToRelative(3.0f, -4.0f)
                horizontalLineToRelative(4.5f)
                lineToRelative(3.0f, 4.0f)
                horizontalLineToRelative(3.75f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(16.487f, 9.513f)
                lineToRelative(1.513f, -1.513f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(1.358f, -1.358f)
                curveToRelative(-0.562f, -0.716f, -1.421f, -1.142f, -2.358f, -1.142f)
                curveToRelative(-1.105f, 0.0f, -2.062f, 0.608f, -2.583f, 1.5f)
                horizontalLineToRelative(-3.22f)
                curveToRelative(0.669f, -2.584f, 3.013f, -4.5f, 5.803f, -4.5f)
                curveToRelative(1.752f, 0.0f, 3.367f, 0.746f, 4.487f, 2.013f)
                close()
                moveTo(14.578f, 15.0f)
                horizontalLineToRelative(3.201f)
                curveToRelative(-0.671f, 2.58f, -2.992f, 4.5f, -5.779f, 4.5f)
                curveToRelative(-1.752f, 0.0f, -3.367f, -0.746f, -4.487f, -2.013f)
                lineToRelative(-1.513f, 1.513f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(-1.358f, 1.358f)
                curveToRelative(0.562f, 0.716f, 1.421f, 1.142f, 2.358f, 1.142f)
                curveToRelative(1.105f, 0.0f, 2.06f, -0.607f, 2.578f, -1.5f)
                close()
            }
        }
        .build()
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
