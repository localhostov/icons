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

public val Icons.Filled.Box: ImageVector
    get() {
        if (_box != null) {
            return _box!!
        }
        _box = Builder(name = "Box", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.103f, viewportHeight = 512.103f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(405.333f, 0.052f)
                horizontalLineTo(106.667f)
                curveTo(47.756f, 0.052f, 0.0f, 47.808f, 0.0f, 106.718f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.0f, 35.346f, 28.654f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(384.0f)
                curveToRelative(33.692f, 0.411f, 61.813f, -25.619f, 64.0f, -59.243f)
                curveTo(514.568f, 52.562f, 468.892f, 2.721f, 409.979f, 0.153f)
                curveTo(408.431f, 0.085f, 406.882f, 0.052f, 405.333f, 0.052f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(469.333f, 213.385f)
                horizontalLineTo(42.667f)
                curveToRelative(-11.782f, 0.0f, -21.333f, 9.551f, -21.333f, 21.333f)
                verticalLineToRelative(170.667f)
                curveTo(21.404f, 464.266f, 69.119f, 511.981f, 128.0f, 512.052f)
                horizontalLineToRelative(256.0f)
                curveToRelative(58.881f, -0.071f, 106.596f, -47.786f, 106.667f, -106.667f)
                verticalLineTo(234.718f)
                curveTo(490.667f, 222.936f, 481.115f, 213.385f, 469.333f, 213.385f)
                close()
                moveTo(320.0f, 320.052f)
                horizontalLineTo(192.0f)
                curveToRelative(-11.782f, 0.0f, -21.333f, -9.551f, -21.333f, -21.333f)
                reflectiveCurveToRelative(9.551f, -21.333f, 21.333f, -21.333f)
                horizontalLineToRelative(128.0f)
                curveToRelative(11.782f, 0.0f, 21.333f, 9.551f, 21.333f, 21.333f)
                reflectiveCurveTo(331.782f, 320.052f, 320.0f, 320.052f)
                close()
            }
        }
        .build()
        return _box!!
    }

private var _box: ImageVector? = null
