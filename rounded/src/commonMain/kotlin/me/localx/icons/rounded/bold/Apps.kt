package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Apps: ImageVector
    get() {
        if (_apps != null) {
            return _apps!!
        }
        _apps = Builder(name = "Apps", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(117.333f, 234.667f)
                curveTo(52.532f, 234.667f, 0.0f, 182.135f, 0.0f, 117.333f)
                reflectiveCurveTo(52.532f, 0.0f, 117.333f, 0.0f)
                reflectiveCurveToRelative(117.333f, 52.532f, 117.333f, 117.333f)
                curveTo(234.596f, 182.106f, 182.106f, 234.596f, 117.333f, 234.667f)
                close()
                moveTo(117.333f, 64.0f)
                curveTo(87.878f, 64.0f, 64.0f, 87.878f, 64.0f, 117.333f)
                reflectiveCurveToRelative(23.878f, 53.333f, 53.333f, 53.333f)
                reflectiveCurveToRelative(53.333f, -23.878f, 53.333f, -53.333f)
                reflectiveCurveTo(146.789f, 64.0f, 117.333f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(394.667f, 234.667f)
                curveToRelative(-64.801f, 0.0f, -117.333f, -52.532f, -117.333f, -117.333f)
                reflectiveCurveTo(329.865f, 0.0f, 394.667f, 0.0f)
                reflectiveCurveTo(512.0f, 52.532f, 512.0f, 117.333f)
                curveTo(511.929f, 182.106f, 459.439f, 234.596f, 394.667f, 234.667f)
                close()
                moveTo(394.667f, 64.0f)
                curveToRelative(-29.455f, 0.0f, -53.333f, 23.878f, -53.333f, 53.333f)
                reflectiveCurveToRelative(23.878f, 53.333f, 53.333f, 53.333f)
                reflectiveCurveTo(448.0f, 146.789f, 448.0f, 117.333f)
                reflectiveCurveTo(424.122f, 64.0f, 394.667f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(117.333f, 512.0f)
                curveTo(52.532f, 512.0f, 0.0f, 459.468f, 0.0f, 394.667f)
                reflectiveCurveToRelative(52.532f, -117.333f, 117.333f, -117.333f)
                reflectiveCurveToRelative(117.333f, 52.532f, 117.333f, 117.333f)
                curveTo(234.596f, 459.439f, 182.106f, 511.929f, 117.333f, 512.0f)
                close()
                moveTo(117.333f, 341.333f)
                curveTo(87.878f, 341.333f, 64.0f, 365.211f, 64.0f, 394.667f)
                reflectiveCurveTo(87.878f, 448.0f, 117.333f, 448.0f)
                reflectiveCurveToRelative(53.333f, -23.878f, 53.333f, -53.333f)
                reflectiveCurveTo(146.789f, 341.333f, 117.333f, 341.333f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(394.667f, 512.0f)
                curveToRelative(-64.801f, 0.0f, -117.333f, -52.532f, -117.333f, -117.333f)
                reflectiveCurveToRelative(52.532f, -117.333f, 117.333f, -117.333f)
                reflectiveCurveTo(512.0f, 329.865f, 512.0f, 394.667f)
                curveTo(511.929f, 459.439f, 459.439f, 511.929f, 394.667f, 512.0f)
                close()
                moveTo(394.667f, 341.333f)
                curveToRelative(-29.455f, 0.0f, -53.333f, 23.878f, -53.333f, 53.333f)
                reflectiveCurveTo(365.211f, 448.0f, 394.667f, 448.0f)
                reflectiveCurveTo(448.0f, 424.122f, 448.0f, 394.667f)
                reflectiveCurveTo(424.122f, 341.333f, 394.667f, 341.333f)
                close()
            }
        }
        .build()
        return _apps!!
    }

private var _apps: ImageVector? = null
