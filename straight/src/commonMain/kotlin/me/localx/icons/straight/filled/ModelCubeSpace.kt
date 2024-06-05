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

public val Icons.Filled.ModelCubeSpace: ImageVector
    get() {
        if (_modelCubeSpace != null) {
            return _modelCubeSpace!!
        }
        _modelCubeSpace = Builder(name = "ModelCubeSpace", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 16.005f)
                lineToRelative(-3.0f, -1.715f)
                verticalLineToRelative(-3.424f)
                lineToRelative(3.0f, 1.714f)
                verticalLineToRelative(3.425f)
                close()
                moveTo(16.0f, 10.866f)
                lineToRelative(-3.0f, 1.714f)
                verticalLineToRelative(3.425f)
                lineToRelative(3.0f, -1.715f)
                verticalLineToRelative(-3.424f)
                close()
                moveTo(6.998f, 7.991f)
                lineToRelative(5.002f, -2.871f)
                lineToRelative(5.002f, 2.871f)
                lineToRelative(4.498f, -2.571f)
                lineTo(12.0f, -0.009f)
                lineTo(2.5f, 5.42f)
                lineToRelative(4.498f, 2.571f)
                close()
                moveTo(18.0f, 9.723f)
                verticalLineToRelative(5.727f)
                lineToRelative(-5.0f, 2.857f)
                verticalLineToRelative(5.13f)
                lineToRelative(9.5f, -5.429f)
                lineTo(22.5f, 7.151f)
                lineToRelative(-4.5f, 2.571f)
                close()
                moveTo(11.0f, 18.308f)
                lineToRelative(-5.0f, -2.857f)
                verticalLineToRelative(-5.727f)
                lineTo(1.5f, 7.151f)
                verticalLineToRelative(10.857f)
                lineToRelative(9.5f, 5.429f)
                verticalLineToRelative(-5.13f)
                close()
                moveTo(9.012f, 9.142f)
                lineToRelative(2.988f, 1.708f)
                lineToRelative(2.988f, -1.708f)
                lineToRelative(-2.988f, -1.715f)
                lineToRelative(-2.988f, 1.715f)
                close()
            }
        }
        .build()
        return _modelCubeSpace!!
    }

private var _modelCubeSpace: ImageVector? = null
