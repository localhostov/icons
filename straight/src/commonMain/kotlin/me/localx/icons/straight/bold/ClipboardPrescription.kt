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

public val Icons.Bold.ClipboardPrescription: ImageVector
    get() {
        if (_clipboardPrescription != null) {
            return _clipboardPrescription!!
        }
        _clipboardPrescription = Builder(name = "ClipboardPrescription", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.662f, 2.0f)
                curveToRelative(-0.563f, -1.182f, -1.769f, -2.0f, -3.162f, -2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.394f, 0.0f, -2.599f, 0.818f, -3.162f, 2.0f)
                lineTo(2.0f, 2.0f)
                verticalLineToRelative(18.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(22.0f, 2.0f)
                horizontalLineToRelative(-5.338f)
                close()
                moveTo(19.0f, 20.5f)
                curveToRelative(0.0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                lineTo(5.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(15.5f)
                close()
                moveTo(12.228f, 12.736f)
                curveToRelative(1.044f, -0.47f, 1.772f, -1.519f, 1.772f, -2.736f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.131f)
                lineToRelative(2.29f, 3.429f)
                lineToRelative(-2.421f, 3.571f)
                horizontalLineToRelative(2.194f)
                lineToRelative(1.324f, -1.928f)
                lineToRelative(1.288f, 1.928f)
                horizontalLineToRelative(2.194f)
                lineToRelative(-2.35f, -3.577f)
                lineToRelative(2.35f, -3.423f)
                horizontalLineToRelative(-2.255f)
                lineToRelative(-1.19f, 1.756f)
                lineToRelative(-1.327f, -2.02f)
                close()
                moveTo(9.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.449f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _clipboardPrescription!!
    }

private var _clipboardPrescription: ImageVector? = null
