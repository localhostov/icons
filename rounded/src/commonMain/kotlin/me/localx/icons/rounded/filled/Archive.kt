package me.localx.icons.rounded.filled

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

public val Icons.Filled.Archive: ImageVector
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive = Builder(name = "Archive", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(362.667f, 0.0f)
                horizontalLineTo(149.333f)
                curveTo(90.423f, 0.0f, 42.667f, 47.756f, 42.667f, 106.667f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(426.667f)
                verticalLineToRelative(-128.0f)
                curveTo(469.333f, 47.756f, 421.577f, 0.0f, 362.667f, 0.0f)
                close()
                moveTo(277.333f, 149.333f)
                horizontalLineToRelative(-42.667f)
                curveToRelative(-11.782f, 0.0f, -21.333f, -9.551f, -21.333f, -21.333f)
                reflectiveCurveToRelative(9.551f, -21.333f, 21.333f, -21.333f)
                horizontalLineToRelative(42.667f)
                curveToRelative(11.782f, 0.0f, 21.333f, 9.551f, 21.333f, 21.333f)
                reflectiveCurveTo(289.115f, 149.333f, 277.333f, 149.333f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(42.667f, 405.333f)
                curveTo(42.667f, 464.244f, 90.423f, 512.0f, 149.333f, 512.0f)
                horizontalLineToRelative(213.333f)
                curveToRelative(58.91f, 0.0f, 106.667f, -47.756f, 106.667f, -106.667f)
                verticalLineToRelative(-128.0f)
                horizontalLineTo(42.667f)
                verticalLineTo(405.333f)
                close()
                moveTo(234.667f, 362.667f)
                horizontalLineToRelative(42.667f)
                curveToRelative(11.782f, 0.0f, 21.333f, 9.551f, 21.333f, 21.333f)
                curveToRelative(0.0f, 11.782f, -9.551f, 21.333f, -21.333f, 21.333f)
                horizontalLineToRelative(-42.667f)
                curveToRelative(-11.782f, 0.0f, -21.333f, -9.551f, -21.333f, -21.333f)
                curveTo(213.333f, 372.218f, 222.885f, 362.667f, 234.667f, 362.667f)
                close()
            }
        }
        .build()
        return _archive!!
    }

private var _archive: ImageVector? = null
