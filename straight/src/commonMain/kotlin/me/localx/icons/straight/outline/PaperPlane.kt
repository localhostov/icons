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

public val Icons.Outline.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.444f, 6.669f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.865f, 3.337f)
                lineToRelative(3.412f, 3.408f)
                lineTo(3.991f, 20.0f)
                horizontalLineToRelative(6.593f)
                lineToRelative(3.435f, 3.43f)
                arcToRelative(1.987f, 1.987f, 0.0f, false, false, 1.408f, 0.588f)
                arcToRelative(2.034f, 2.034f, 0.0f, false, false, 0.51f, -0.066f)
                arcToRelative(1.978f, 1.978f, 0.0f, false, false, 1.42f, -1.379f)
                lineTo(23.991f, 0.021f)
                close()
                moveTo(2.0f, 8.592f)
                lineToRelative(17.028f, -5.02f)
                lineTo(5.993f, 16.586f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(15.44f, 22.016f)
                lineTo(11.413f, 18.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(20.446f, 4.978f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
