package me.localx.icons.straight.filled

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

public val Icons.Filled.GrinTongue: ImageVector
    get() {
        if (_grinTongue != null) {
            return _grinTongue!!
        }
        _grinTongue = Builder(name = "GrinTongue", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.839f, 362.667f)
                horizontalLineToRelative(42.667f)
                verticalLineToRelative(12.8f)
                curveToRelative(-1.323f, 39.232f, -41.344f, 39.189f, -42.667f, 0.0f)
                verticalLineTo(362.667f)
                close()
                moveTo(511.172f, 256.0f)
                curveToRelative(-0.153f, 141.322f, -114.678f, 255.847f, -256.0f, 256.0f)
                curveToRelative(-339.2f, -12.8f, -339.051f, -499.2f, 0.0f, -512.0f)
                curveTo(396.494f, 0.153f, 511.019f, 114.678f, 511.172f, 256.0f)
                close()
                moveTo(148.505f, 224.0f)
                curveToRelative(0.0f, 17.673f, 14.327f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.327f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.327f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveTo(148.505f, 206.327f, 148.505f, 224.0f)
                close()
                moveTo(361.839f, 320.0f)
                horizontalLineTo(148.505f)
                verticalLineToRelative(42.667f)
                horizontalLineToRelative(42.667f)
                verticalLineToRelative(12.8f)
                curveToRelative(2.837f, 95.893f, 125.205f, 95.787f, 128.0f, 0.0f)
                verticalLineToRelative(-12.8f)
                horizontalLineToRelative(42.667f)
                verticalLineTo(320.0f)
                close()
                moveTo(361.839f, 224.0f)
                curveToRelative(0.0f, -17.673f, -14.327f, -32.0f, -32.0f, -32.0f)
                curveToRelative(-17.673f, 0.0f, -32.0f, 14.327f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.327f, 32.0f, 32.0f, 32.0f)
                curveTo(347.512f, 256.0f, 361.839f, 241.673f, 361.839f, 224.0f)
                close()
            }
        }
        .build()
        return _grinTongue!!
    }

private var _grinTongue: ImageVector? = null
