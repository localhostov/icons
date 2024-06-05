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

public val Icons.Filled.HouseCrack: ImageVector
    get() {
        if (_houseCrack != null) {
            return _houseCrack!!
        }
        _houseCrack = Builder(name = "HouseCrack", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.849f, 7.681f)
                lineTo(13.849f, 0.637f)
                curveToRelative(-1.089f, -0.85f, -2.608f, -0.851f, -3.697f, 0.0f)
                lineTo(1.151f, 7.68f)
                curveToRelative(-0.731f, 0.573f, -1.151f, 1.435f, -1.151f, 2.363f)
                verticalLineToRelative(13.957f)
                horizontalLineTo(9.176f)
                lineToRelative(1.96f, -5.0f)
                horizontalLineToRelative(-3.23f)
                curveToRelative(-0.722f, 0.0f, -1.153f, -0.804f, -0.754f, -1.406f)
                lineToRelative(5.648f, -8.594f)
                horizontalLineToRelative(1.199f)
                lineToRelative(-1.827f, 6.0f)
                horizontalLineToRelative(3.904f)
                curveToRelative(0.619f, 0.0f, 1.062f, 0.597f, 0.883f, 1.19f)
                lineToRelative(-2.619f, 7.81f)
                horizontalLineToRelative(9.659f)
                verticalLineTo(10.043f)
                curveToRelative(0.0f, -0.929f, -0.42f, -1.79f, -1.151f, -2.362f)
                close()
            }
        }
        .build()
        return _houseCrack!!
    }

private var _houseCrack: ImageVector? = null
