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

public val Icons.Bold.Stomach: ImageVector
    get() {
        if (_stomach != null) {
            return _stomach!!
        }
        _stomach = Builder(name = "Stomach", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.5f, 3.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                lineTo(7.0f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(0.499f)
                lineToRelative(-0.004f, 7.501f)
                curveToRelative(0.0f, 1.542f, -2.194f, 2.335f, -2.745f, 2.509f)
                curveToRelative(-1.816f, 0.126f, -3.255f, 1.644f, -3.255f, 3.493f)
                lineToRelative(0.005f, 4.499f)
                lineToRelative(3.0f, -0.004f)
                lineToRelative(-0.005f, -4.497f)
                curveToRelative(0.0f, -0.172f, 0.087f, -0.323f, 0.22f, -0.414f)
                curveToRelative(0.178f, 0.111f, 0.352f, 0.221f, 0.524f, 0.33f)
                curveToRelative(1.982f, 1.257f, 4.033f, 2.557f, 8.753f, 2.583f)
                horizontalLineToRelative(0.043f)
                curveToRelative(1.968f, 0.0f, 3.826f, -0.771f, 5.238f, -2.175f)
                curveToRelative(1.434f, -1.426f, 2.223f, -3.316f, 2.223f, -5.322f)
                lineToRelative(0.005f, -4.003f)
                curveToRelative(0.0f, -4.136f, -3.364f, -7.5f, -7.5f, -7.5f)
                close()
                moveTo(14.5f, 6.0f)
                curveToRelative(2.367f, 0.0f, 4.312f, 1.836f, 4.487f, 4.157f)
                curveToRelative(-0.44f, -0.096f, -0.936f, -0.157f, -1.487f, -0.157f)
                curveToRelative(-1.277f, 0.0f, -2.146f, 0.332f, -2.843f, 0.599f)
                curveToRelative(-0.608f, 0.233f, -1.048f, 0.401f, -1.771f, 0.401f)
                curveToRelative(-0.777f, 0.0f, -1.44f, -0.204f, -1.89f, -0.396f)
                lineToRelative(0.003f, -4.604f)
                horizontalLineToRelative(3.501f)
                close()
                moveTo(17.657f, 17.698f)
                curveToRelative(-0.846f, 0.84f, -1.954f, 1.302f, -3.124f, 1.302f)
                horizontalLineToRelative(-0.024f)
                curveToRelative(-2.935f, -0.016f, -4.481f, -0.555f, -5.866f, -1.327f)
                curveToRelative(1.217f, -0.864f, 2.252f, -2.146f, 2.345f, -3.912f)
                curveToRelative(0.558f, 0.141f, 1.197f, 0.239f, 1.899f, 0.239f)
                curveToRelative(1.277f, 0.0f, 2.146f, -0.332f, 2.843f, -0.599f)
                curveToRelative(0.608f, -0.233f, 1.048f, -0.401f, 1.771f, -0.401f)
                curveToRelative(0.676f, 0.0f, 1.174f, 0.153f, 1.497f, 0.299f)
                verticalLineToRelative(1.202f)
                curveToRelative(-0.001f, 1.203f, -0.477f, 2.339f, -1.339f, 3.197f)
                close()
            }
        }
        .build()
        return _stomach!!
    }

private var _stomach: ImageVector? = null
