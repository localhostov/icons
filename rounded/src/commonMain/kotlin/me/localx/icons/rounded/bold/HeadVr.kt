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

public val Icons.Bold.HeadVr: ImageVector
    get() {
        if (_headVr != null) {
            return _headVr!!
        }
        _headVr = Builder(name = "HeadVr", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 5.0f)
                horizontalLineToRelative(-0.204f)
                curveToRelative(-0.16f, -0.233f, -0.306f, -0.432f, -0.414f, -0.563f)
                curveTo(17.395f, 1.116f, 13.295f, -0.521f, 9.184f, 0.153f)
                curveTo(4.952f, 0.852f, 1.5f, 3.97f, 0.389f, 8.099f)
                curveToRelative(-0.897f, 3.335f, -0.168f, 6.85f, 2.003f, 9.641f)
                curveToRelative(0.277f, 0.357f, 0.608f, 0.932f, 0.608f, 1.636f)
                verticalLineToRelative(0.11f)
                curveToRelative(0.0f, 2.489f, 2.019f, 4.515f, 4.5f, 4.515f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.971f, 0.0f, 3.649f, -1.273f, 4.257f, -3.04f)
                curveToRelative(1.702f, -0.207f, 3.235f, -1.206f, 4.104f, -2.71f)
                curveToRelative(0.414f, -0.717f, 0.169f, -1.635f, -0.549f, -2.049f)
                curveToRelative(-0.717f, -0.414f, -1.635f, -0.17f, -2.049f, 0.549f)
                curveToRelative(-0.445f, 0.771f, -1.275f, 1.25f, -2.166f, 1.25f)
                horizontalLineToRelative(-0.598f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                lineTo(7.5f, 21.001f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.68f, -1.5f, -1.515f)
                verticalLineToRelative(-0.11f)
                curveToRelative(0.0f, -1.229f, -0.429f, -2.432f, -1.239f, -3.477f)
                curveToRelative(-0.722f, -0.928f, -1.742f, -2.639f, -1.756f, -4.898f)
                horizontalLineToRelative(6.252f)
                curveToRelative(0.619f, 1.746f, 2.287f, 3.0f, 4.243f, 3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(9.672f, 3.114f)
                curveToRelative(2.428f, -0.403f, 4.843f, 0.301f, 6.658f, 1.886f)
                horizontalLineToRelative(-2.829f)
                curveToRelative(-1.956f, 0.0f, -3.624f, 1.254f, -4.243f, 3.0f)
                lineTo(3.581f, 8.0f)
                curveToRelative(1.025f, -2.523f, 3.372f, -4.438f, 6.091f, -4.886f)
                close()
                moveTo(21.0f, 10.5f)
                curveToRelative(0.0f, 0.275f, -0.225f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _headVr!!
    }

private var _headVr: ImageVector? = null
