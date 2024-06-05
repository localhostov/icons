package me.localx.icons.straight.bold

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

public val Icons.Bold.TrashPlus: ImageVector
    get() {
        if (_trashPlus != null) {
            return _trashPlus!!
        }
        _trashPlus = Builder(name = "TrashPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.5f, 15.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(23.0f, 6.0f)
                horizontalLineToRelative(-1.62f)
                lineToRelative(-1.233f, 14.791f)
                curveToRelative(-0.149f, 1.799f, -1.681f, 3.209f, -3.487f, 3.209f)
                lineTo(7.34f, 24.0f)
                curveToRelative(-1.807f, 0.0f, -3.338f, -1.41f, -3.487f, -3.21f)
                lineToRelative(-1.233f, -14.79f)
                horizontalLineToRelative(-1.62f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.379f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(18.369f, 6.0f)
                lineTo(5.631f, 6.0f)
                lineToRelative(1.212f, 14.541f)
                curveToRelative(0.021f, 0.262f, 0.235f, 0.459f, 0.497f, 0.459f)
                horizontalLineToRelative(9.32f)
                curveToRelative(0.262f, 0.0f, 0.476f, -0.197f, 0.497f, -0.458f)
                lineToRelative(1.212f, -14.542f)
                close()
            }
        }
        .build()
        return _trashPlus!!
    }

private var _trashPlus: ImageVector? = null
