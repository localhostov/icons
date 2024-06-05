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

public val Icons.Bold.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(20.941f, 11.0f)
                lineTo(17.463f, 11.0f)
                arcToRelative(18.368f, 18.368f, 0.0f, false, false, -2.289f, -7.411f)
                arcTo(9.013f, 9.013f, 0.0f, false, true, 20.941f, 11.0f)
                close()
                moveTo(9.685f, 14.0f)
                horizontalLineToRelative(4.63f)
                arcTo(16.946f, 16.946f, 0.0f, false, true, 12.0f, 19.9f)
                arcTo(16.938f, 16.938f, 0.0f, false, true, 9.685f, 14.0f)
                close()
                moveTo(9.553f, 11.0f)
                arcTo(16.246f, 16.246f, 0.0f, false, true, 12.0f, 4.1f)
                arcTo(16.241f, 16.241f, 0.0f, false, true, 14.447f, 11.0f)
                close()
                moveTo(8.826f, 3.589f)
                arcTo(18.368f, 18.368f, 0.0f, false, false, 6.537f, 11.0f)
                lineTo(3.059f, 11.0f)
                arcTo(9.013f, 9.013f, 0.0f, false, true, 8.826f, 3.589f)
                close()
                moveTo(3.232f, 14.0f)
                lineTo(6.641f, 14.0f)
                arcToRelative(18.906f, 18.906f, 0.0f, false, false, 2.185f, 6.411f)
                arcTo(9.021f, 9.021f, 0.0f, false, true, 3.232f, 14.0f)
                close()
                moveTo(15.174f, 20.411f)
                arcTo(18.884f, 18.884f, 0.0f, false, false, 17.359f, 14.0f)
                horizontalLineToRelative(3.409f)
                arcTo(9.021f, 9.021f, 0.0f, false, true, 15.174f, 20.411f)
                close()
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null
