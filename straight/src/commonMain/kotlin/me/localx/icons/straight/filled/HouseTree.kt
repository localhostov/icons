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

public val Icons.Filled.HouseTree: ImageVector
    get() {
        if (_houseTree != null) {
            return _houseTree!!
        }
        _houseTree = Builder(name = "HouseTree", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.849f, 12.747f)
                lineToRelative(-5.448f, -4.264f)
                curveToRelative(-0.824f, -0.646f, -1.977f, -0.646f, -2.801f, 0.0f)
                lineTo(1.151f, 12.746f)
                curveToRelative(-0.731f, 0.573f, -1.151f, 1.435f, -1.151f, 2.363f)
                verticalLineToRelative(8.891f)
                lineTo(16.0f, 24.0f)
                lineTo(16.0f, 15.109f)
                curveToRelative(0.0f, -0.929f, -0.42f, -1.79f, -1.151f, -2.362f)
                close()
                moveTo(10.0f, 19.0f)
                lineTo(6.0f, 19.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(23.988f, 24.0f)
                horizontalLineToRelative(-5.988f)
                lineTo(18.0f, 15.109f)
                curveToRelative(0.0f, -1.548f, -0.699f, -2.983f, -1.919f, -3.938f)
                lineToRelative(-5.446f, -4.262f)
                curveToRelative(-0.344f, -0.27f, -0.722f, -0.471f, -1.113f, -0.621f)
                lineTo(11.926f, 1.214f)
                curveToRelative(0.025f, -0.052f, 0.526f, -1.214f, 2.135f, -1.214f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.817f, 0.0f, 1.584f, 0.4f, 2.051f, 1.071f)
                lineToRelative(5.285f, 9.929f)
                horizontalLineToRelative(-2.504f)
                lineToRelative(3.673f, 6.0f)
                horizontalLineToRelative(-2.288f)
                lineToRelative(3.71f, 7.0f)
                close()
            }
        }
        .build()
        return _houseTree!!
    }

private var _houseTree: ImageVector? = null
