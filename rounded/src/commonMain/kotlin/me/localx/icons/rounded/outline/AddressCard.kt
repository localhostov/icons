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

public val Icons.Outline.AddressCard: ImageVector
    get() {
        if (_addressCard != null) {
            return _addressCard!!
        }
        _addressCard = Builder(name = "AddressCard", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 4.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(22.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                close()
                moveTo(16.985f, 14.45f)
                lineToRelative(-5.293f, 5.272f)
                curveToRelative(-0.508f, 0.509f, -1.195f, 0.778f, -1.907f, 0.778f)
                curveToRelative(-0.369f, 0.0f, -0.744f, -0.072f, -1.104f, -0.221f)
                curveToRelative(-1.033f, -0.425f, -1.677f, -1.352f, -1.681f, -2.418f)
                verticalLineToRelative(-1.861f)
                lineTo(3.0f, 16.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.859f)
                curveToRelative(0.005f, -1.07f, 0.649f, -1.997f, 1.682f, -2.421f)
                curveToRelative(1.055f, -0.433f, 2.238f, -0.215f, 3.012f, 0.559f)
                lineToRelative(5.29f, 5.267f)
                curveToRelative(1.352f, 1.353f, 1.351f, 3.551f, 0.0f, 4.903f)
                close()
                moveTo(15.571f, 10.962f)
                lineToRelative(-5.29f, -5.267f)
                curveToRelative(-0.245f, -0.245f, -0.593f, -0.224f, -0.838f, -0.125f)
                curveToRelative(-0.132f, 0.055f, -0.441f, 0.22f, -0.442f, 0.576f)
                verticalLineToRelative(2.854f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 10.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(2.857f)
                curveToRelative(0.001f, 0.353f, 0.31f, 0.519f, 0.442f, 0.573f)
                curveToRelative(0.244f, 0.101f, 0.593f, 0.122f, 0.836f, -0.123f)
                lineToRelative(5.293f, -5.272f)
                curveToRelative(0.57f, -0.571f, 0.57f, -1.501f, 0.0f, -2.073f)
                close()
            }
        }
        .build()
        return _addressCard!!
    }

private var _addressCard: ImageVector? = null
