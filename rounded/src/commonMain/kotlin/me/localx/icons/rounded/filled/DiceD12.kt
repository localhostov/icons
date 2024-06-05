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

public val Icons.Filled.DiceD12: ImageVector
    get() {
        if (_diceD12 != null) {
            return _diceD12!!
        }
        _diceD12 = Builder(name = "DiceD12", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.261f, 13.751f)
                lineTo(0.866f, 7.28f)
                lineTo(2.443f, 4.651f)
                lineTo(11.0f, 6.79f)
                verticalLineToRelative(4.592f)
                close()
                moveTo(21.547f, 4.634f)
                lineTo(13.0f, 6.77f)
                verticalLineToRelative(4.612f)
                lineToRelative(4.737f, 2.368f)
                lineToRelative(5.384f, -6.492f)
                close()
                moveTo(12.0f, 13.118f)
                lineTo(7.246f, 15.5f)
                lineTo(10.36f, 24.0f)
                horizontalLineToRelative(3.232f)
                lineToRelative(3.158f, -8.507f)
                close()
                moveTo(18.878f, 15.508f)
                lineTo(15.878f, 23.588f)
                arcToRelative(4.848f, 4.848f, 0.0f, false, false, 0.587f, -0.3f)
                lineToRelative(3.192f, -1.915f)
                arcToRelative(5.026f, 5.026f, 0.0f, false, false, 1.715f, -1.715f)
                lineToRelative(1.915f, -3.192f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 24.0f, 13.892f)
                lineTo(24.0f, 10.108f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -0.052f, -0.714f)
                close()
                moveTo(11.96f, 4.969f)
                lineToRelative(8.146f, -2.036f)
                arcToRelative(4.724f, 4.724f, 0.0f, false, false, -0.449f, -0.3f)
                lineTo(16.465f, 0.713f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 13.892f, 0.0f)
                lineTo(10.108f, 0.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.535f, 0.713f)
                lineTo(4.343f, 2.628f)
                arcToRelative(5.184f, 5.184f, 0.0f, false, false, -0.47f, 0.32f)
                close()
                moveTo(5.121f, 15.507f)
                lineTo(0.048f, 9.422f)
                arcTo(4.912f, 4.912f, 0.0f, false, false, 0.0f, 10.108f)
                verticalLineToRelative(3.784f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.713f, 2.573f)
                lineToRelative(1.915f, 3.192f)
                arcToRelative(5.026f, 5.026f, 0.0f, false, false, 1.715f, 1.715f)
                lineToRelative(3.192f, 1.915f)
                arcToRelative(5.025f, 5.025f, 0.0f, false, false, 0.535f, 0.278f)
                close()
            }
        }
        .build()
        return _diceD12!!
    }

private var _diceD12: ImageVector? = null
