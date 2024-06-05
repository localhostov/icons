package me.localx.icons.rounded.bold

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

public val Icons.Bold.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) {
            return _phoneCall!!
        }
        _phoneCall = Builder(name = "PhoneCall", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 24.0f)
                curveTo(9.351f, 24.229f, -5.075f, 9.787f, 1.862f, 1.938f)
                curveTo(1.887f, 1.914f, 2.954f, 0.984f, 2.954f, 0.984f)
                arcToRelative(3.583f, 3.583f, 0.0f, false, true, 4.908f, 0.041f)
                lineToRelative(2.152f, 2.318f)
                arcToRelative(3.522f, 3.522f, 0.0f, false, true, -0.039f, 4.91f)
                lineToRelative(-0.388f, 0.394f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, 5.754f, 5.778f)
                lineToRelative(0.411f, -0.4f)
                arcToRelative(3.585f, 3.585f, 0.0f, false, true, 4.945f, 0.0f)
                lineTo(22.934f, 16.1f)
                arcToRelative(3.515f, 3.515f, 0.0f, false, true, 0.082f, 4.946f)
                reflectiveCurveToRelative(-0.93f, 1.066f, -0.954f, 1.091f)
                arcTo(6.39f, 6.39f, 0.0f, false, true, 17.5f, 24.0f)
                close()
                moveTo(3.95f, 4.1f)
                curveTo(-0.909f, 10.118f, 14.644f, 24.773f, 19.905f, 20.05f)
                curveToRelative(0.0f, 0.0f, 0.924f, -1.059f, 0.949f, -1.083f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.707f)
                lineToRelative(-2.238f, -2.074f)
                curveToRelative(-0.3f, -0.25f, -0.469f, -0.253f, -0.747f, -0.04f)
                lineToRelative(-1.136f, 1.118f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.587f, 0.332f)
                arcTo(14.852f, 14.852f, 0.0f, false, true, 6.414f, 8.877f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.323f, -1.61f)
                lineTo(7.845f, 6.141f)
                arcToRelative(0.485f, 0.485f, 0.0f, false, false, 0.009f, -0.717f)
                lineTo(5.7f, 3.106f)
                arcToRelative(0.487f, 0.487f, 0.0f, false, false, -0.667f, 0.04f)
                curveTo(5.009f, 3.171f, 3.95f, 4.1f, 3.95f, 4.1f)
                close()
                moveTo(16.808f, 15.086f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(24.0f, 9.5f)
                arcTo(9.511f, 9.511f, 0.0f, false, false, 14.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcTo(6.508f, 6.508f, 0.0f, false, true, 21.0f, 9.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
                moveTo(19.0f, 9.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 14.5f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 9.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
            }
        }
        .build()
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null
