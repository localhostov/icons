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

public val Icons.Filled.HouseChimney: ImageVector
    get() {
        if (_houseChimney != null) {
            return _houseChimney!!
        }
        _houseChimney = Builder(name = "HouseChimney", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.849f, 7.68f)
                lineToRelative(-0.869f, -0.68f)
                horizontalLineToRelative(0.021f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.451f)
                lineTo(13.849f, 0.637f)
                curveToRelative(-1.088f, -0.852f, -2.609f, -0.852f, -3.697f, 0.0f)
                lineTo(1.151f, 7.68f)
                curveToRelative(-0.731f, 0.572f, -1.151f, 1.434f, -1.151f, 2.363f)
                verticalLineToRelative(13.957f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(10.043f)
                curveToRelative(0.0f, -0.929f, -0.42f, -1.791f, -1.151f, -2.363f)
                close()
            }
        }
        .build()
        return _houseChimney!!
    }

private var _houseChimney: ImageVector? = null
