package me.localx.icons.rounded.filled

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

public val Icons.Filled.UserCheck: ImageVector
    get() {
        if (_userCheck != null) {
            return _userCheck!!
        }
        _userCheck = Builder(name = "UserCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(11.309f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveTo(2.0f, 2.691f, 2.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(8.0f, 14.0f)
                curveTo(3.589f, 14.0f, 0.0f, 17.589f, 0.0f, 22.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -4.411f, -3.589f, -8.0f, -8.0f, -8.0f)
                close()
                moveTo(23.697f, 10.217f)
                lineToRelative(-3.992f, 3.875f)
                curveToRelative(-0.581f, 0.582f, -1.368f, 0.907f, -2.205f, 0.907f)
                reflectiveCurveToRelative(-1.624f, -0.326f, -2.215f, -0.917f)
                lineToRelative(-1.971f, -1.854f)
                curveToRelative(-0.402f, -0.378f, -0.421f, -1.011f, -0.042f, -1.414f)
                curveToRelative(0.379f, -0.402f, 1.011f, -0.421f, 1.414f, -0.042f)
                lineToRelative(1.992f, 1.875f)
                curveToRelative(0.471f, 0.47f, 1.195f, 0.449f, 1.623f, 0.021f)
                lineToRelative(4.002f, -3.886f)
                curveToRelative(0.396f, -0.385f, 1.029f, -0.375f, 1.414f, 0.021f)
                curveToRelative(0.385f, 0.396f, 0.375f, 1.03f, -0.021f, 1.414f)
                close()
            }
        }
        .build()
        return _userCheck!!
    }

private var _userCheck: ImageVector? = null
