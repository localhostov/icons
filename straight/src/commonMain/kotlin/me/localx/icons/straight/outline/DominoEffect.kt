package me.localx.icons.straight.outline

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

public val Icons.Outline.DominoEffect: ImageVector
    get() {
        if (_dominoEffect != null) {
            return _dominoEffect!!
        }
        _dominoEffect = Builder(name = "DominoEffect", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(22.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                lineTo(20.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(10.552f, 19.184f)
                lineToRelative(1.896f, 0.633f)
                lineToRelative(5.0f, -15.0f)
                lineToRelative(-1.896f, -0.633f)
                lineToRelative(-5.0f, 15.0f)
                close()
                moveTo(11.5f, 11.0f)
                curveToRelative(0.747f, 0.0f, 1.44f, -0.536f, 1.56f, -1.273f)
                curveToRelative(0.153f, -0.94f, -0.568f, -1.739f, -1.479f, -1.739f)
                lineToRelative(-7.58f, 0.013f)
                lineToRelative(1.137f, -1.434f)
                curveToRelative(0.553f, -0.664f, 0.463f, -1.651f, -0.2f, -2.204f)
                curveToRelative(-0.664f, -0.553f, -1.651f, -0.464f, -2.204f, 0.2f)
                lineToRelative(-2.733f, 3.937f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5.932f)
                lineToRelative(-2.625f, 7.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.693f)
                lineToRelative(3.0f, -8.0f)
                horizontalLineToRelative(3.807f)
                close()
            }
        }
        .build()
        return _dominoEffect!!
    }

private var _dominoEffect: ImageVector? = null
