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

public val Icons.Filled.MemberSearch: ImageVector
    get() {
        if (_memberSearch != null) {
            return _memberSearch!!
        }
        _memberSearch = Builder(name = "MemberSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.707f, 23.707f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-2.54f, -2.54f)
                curveToRelative(-0.791f, 0.524f, -1.736f, 0.833f, -2.753f, 0.833f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                curveToRelative(0.0f, 1.017f, -0.309f, 1.962f, -0.833f, 2.753f)
                lineToRelative(2.54f, 2.54f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                close()
                moveTo(9.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(12.309f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveTo(3.0f, 2.691f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(10.0f, 17.0f)
                curveToRelative(0.0f, -1.01f, 0.218f, -1.967f, 0.603f, -2.834f)
                curveToRelative(-0.522f, -0.097f, -1.053f, -0.166f, -1.603f, -0.166f)
                curveTo(4.043f, 14.0f, 0.009f, 18.028f, 0.0f, 22.983f)
                curveToRelative(-0.001f, 0.557f, 0.443f, 1.017f, 1.0f, 1.017f)
                lineTo(17.0f, 24.0f)
                curveToRelative(-3.866f, 0.0f, -7.0f, -3.134f, -7.0f, -7.0f)
                close()
            }
        }
        .build()
        return _memberSearch!!
    }

private var _memberSearch: ImageVector? = null
